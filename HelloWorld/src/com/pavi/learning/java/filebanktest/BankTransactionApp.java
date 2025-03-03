package com.pavi.learning.java.filebanktest;

import java.io.*;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class BankTransactionApp {

    public static void main(String[] args) {

        Path cwd = Path.of("").toAbsolutePath();
        System.out.println(cwd);

        ArrayList<BankTransaction> bankTransact = new ArrayList<>();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        try {
            BufferedReader br = new BufferedReader(new FileReader(cwd + "/bank/csv/bank_transactions_data_2.csv"));

            String line;
            int lineCnt = 0;

            while ((line = br.readLine()) != null) {

                if (lineCnt == 0) {
                    System.out.println(line);
                    lineCnt++;
                    continue;

                }

                String[] lineStrArr = line.split(",");

                BankTransaction bank = new BankTransaction();

                bank.setTransactionId(lineStrArr[0]);
                bank.setAccountId(lineStrArr[1]);
                bank.setTransactionAmount(Double.parseDouble(lineStrArr[2]));
                bank.setTransactionDateTime(LocalDateTime.parse(lineStrArr[3],formatter));
                bank.setTransactionType(lineStrArr[4]);
                bank.setLocation(lineStrArr[5]);
                bank.setDeviceId(lineStrArr[6]);
                bank.setIpAddress(lineStrArr[7]);
                bank.setMerchantId(lineStrArr[8]);
                bank.setChannel(lineStrArr[9]);
                bank.setCustomerAge(Integer.parseInt(lineStrArr[10]));
                bank.setCustomerOccupation(lineStrArr[11]);
                bank.setTransactionDuration(Double.parseDouble(lineStrArr[12]));
                bank.setLoginAttempts(Integer.parseInt(lineStrArr[13]));
                bank.setAccountBalance(Double.parseDouble(lineStrArr[14]));
                bank.setPreviousTransactionDate(LocalDateTime.parse(lineStrArr[15],formatter));
                bankTransact.add(bank);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        fileWithCsv(bankTransact);
    }

    private static void fileWithCsv(ArrayList<BankTransaction> bankTransactions) {

        try(FileWriter writer = new FileWriter("bank.csv")){

            StringBuffer sb = new StringBuffer();

            sb.append("Transaction ID"+",AccountId"+",TransactionAmount"+",TransactionDate"+",TransactionType"+",Location"+",DeviceID"+",IpAddress"+",MerchantID"+",Channel"+",CustomerAge"+",CustomerOccupation"+",TransactionDuration"+",LoginAttempts"+",AccountBalance"+",PreviousTransactionDate");

            writer.write(sb.toString());
            writer.write("\n");

            for (BankTransaction bank : bankTransactions) {

                if (bank.getCustomerAge() >= 30 && bank.getCustomerAge() <= 55) {
                    writer.write(bank.getTransactionId()+ ","+bank.getAccountId()+","+bank.getTransactionAmount()+","+bank.getTransactionType()+","+bank.getTransactionDateTime()+","+bank.getLocation()+","+bank.getDeviceId()+","+bank.getIpAddress()+","+bank.getMerchantId()+","+bank.getChannel()+","+bank.getCustomerAge()+","+bank.getCustomerOccupation()+","+bank.getTransactionDuration()+","+bank.getLoginAttempts()+","+bank.getAccountBalance()+","+bank.getPreviousTransactionDate());
                    writer.write("\n");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}