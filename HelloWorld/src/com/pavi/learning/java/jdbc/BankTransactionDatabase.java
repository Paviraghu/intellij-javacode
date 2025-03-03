package com.pavi.learning.java.jdbc;

import com.pavi.learning.java.database.DBUtil;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BankTransactionDatabase {

    static ArrayList<BankTransaction> bank = new ArrayList<>();

    static Bank bk = new Bank();

    public static void main(String[] args) {

        bk.setStartTime(LocalDateTime.now());

        System.out.println("Data Parsing Starts:" + LocalDateTime.now());

        Path cwd = Path.of("").toAbsolutePath();

        try {
            BufferedReader br = new BufferedReader(new FileReader(cwd + "/bank/csv/bank_transactions_data_2.csv"));

            String line;

            int lineCnt = 1;
            while ((line = br.readLine()) != null) {

                if (lineCnt == 1) {
                    lineCnt++;
                    continue;
                }

                String[] lines = line.split(",");

                BankTransaction bankTransaction = new BankTransaction();

                bankTransaction.setTransactionId(lines[0]);
                bankTransaction.setAccountId(lines[1]);
                bankTransaction.setTransactionAmount(Double.parseDouble(lines[2]));
                bankTransaction.setTransactionDateTime(String.valueOf(lines[3]));
                bankTransaction.setTransactionType(lines[4]);
                bankTransaction.setLocation(lines[5]);
                bankTransaction.setDeviceId(lines[6]);
                bankTransaction.setIpAddress(lines[7]);
                bankTransaction.setMerchantId(lines[8]);
                bankTransaction.setChannel(lines[9]);
                bankTransaction.setCustomerAge(Integer.parseInt(lines[10]));
                bankTransaction.setCustomerOccupation(lines[11]);
                bankTransaction.setTransactionDuration(Double.parseDouble(lines[12]));
                bankTransaction.setLoginAttempts(Integer.parseInt(lines[13]));
                bankTransaction.setAccountBalance(Double.parseDouble(lines[14]));
                bankTransaction.setPreviousTransactionDate(String.valueOf(lines[15]));

                bank.add(bankTransaction);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Parsing count:" + bank.size());

        System.out.println("Data PArsing Ends:" + LocalDateTime.now());

        System.out.println("Ingestion Starts:" + LocalDateTime.now());

        BankTransactionDatabase btdb = new BankTransactionDatabase();

        btdb.startIngestion();

        bk.setEndTime(LocalDateTime.now());
    }

    public void startIngestion() {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        int totalSize = bank.size();
        int chunkSize = (int) Math.ceil((double) totalSize / 2);

        for (int i = 0; i < 2; i++) {

            int start = i * chunkSize;
            int end = Math.min(start + chunkSize, totalSize);
            if (start < totalSize) {
                List<BankTransaction> subList = bank.subList(start, end);
                executorService.submit(new PartDataProcessor(subList));
            }
        }
        executorService.shutdown();
    }

    class PartDataProcessor implements Runnable {

        List<BankTransaction> partData;

        public PartDataProcessor(List<BankTransaction> partData) {
            this.partData = partData;
        }

        @Override
        public void run() {

            System.out.println("PartData:" + partData.size());

            String insertQuery = "INSERT INTO bankdatas(TransactionId,AccountId,TransactionAmount,TransactionDateTime,TransactionType,Location,DeviceId,IpAddress,MerchantId,Channel,CustomerAge,CustomerOccupation,TransactionDuration,LoginAttempts,AccountBalance,PreviousTransactionDate)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement preparedStatement = null;
            Connection connection = null;

            try {
                connection = DBUtil.getConnection();
                preparedStatement = connection.prepareStatement(insertQuery);

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            try {
                int insertCount = 0;

                for (BankTransaction x : partData) {

                    preparedStatement.setString(1, x.getTransactionId());
                    preparedStatement.setString(2, x.getAccountId());
                    preparedStatement.setDouble(3, x.getTransactionAmount());
                    preparedStatement.setString(4, x.getTransactionDateTime());
                    preparedStatement.setString(5, x.getTransactionType());
                    preparedStatement.setString(6, x.getLocation());
                    preparedStatement.setString(7, x.getDeviceId());
                    preparedStatement.setString(8, x.getIpAddress());
                    preparedStatement.setString(9, x.getMerchantId());
                    preparedStatement.setString(10, x.getChannel());
                    preparedStatement.setInt(11, x.getCustomerAge());
                    preparedStatement.setString(12, x.getCustomerOccupation());
                    preparedStatement.setDouble(13, x.getTransactionDuration());
                    preparedStatement.setInt(14, x.getLoginAttempts());
                    preparedStatement.setDouble(15, x.getAccountBalance());
                    preparedStatement.setString(16, x.getPreviousTransactionDate());

                    preparedStatement.executeUpdate();

                    insertCount++;

                }

                System.out.println("InsertedCount:" + insertCount + "Completed:" + LocalDateTime.now());

            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                DBUtil.closeResources(connection, preparedStatement);
            }
        }
    }
}
