package com.pavi.learning.java.practices;


import java.io.*;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class BankTransactApp {

    public static void main(String[] args) {

        Path cwd = Path.of("").toAbsolutePath();

        ArrayList<BankTransact> bankDetail = new ArrayList<>();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        try{
            BufferedReader br = new BufferedReader(new FileReader(cwd+ "/bank/csv/bank_transactions_data_2.csv"));

            String line;
            int lineCnt = 0;

            while ((line = br.readLine()) !=null){

                if (lineCnt == 0){
                    System.out.println(line);
                    lineCnt++;
                    continue;
                }

                String[] lineStrArr = line.split(",");

                BankTransact bank = new BankTransact();

                bank.setTransactionId(lineStrArr[0]);
                bank.setAccountId(lineStrArr[1]);
                bank.setTransactionAmount(Double.parseDouble(lineStrArr[2]));
                bank.setTransactionDateTime(LocalDateTime.parse(lineStrArr[3],formatter));
                bank.setTransactionType(lineStrArr[4]);
                bank.setLocation(lineStrArr[5]);
                bank.setDeviceID(lineStrArr[6]);
                bank.setIpAddress(lineStrArr[7]);
                bank.setMerchantId(lineStrArr[8]);
                bank.setChannel(lineStrArr[9]);
                bank.setCustomerAge(Integer.parseInt(lineStrArr[10]));
                bank.setCustomerOccupation(lineStrArr[11]);
                bank.setTransactionDuration(Double.parseDouble(lineStrArr[12]));
                bank.setLoginAttempts(Integer.parseInt(lineStrArr[13]));
                bank.setAccountBalance(Double.parseDouble(lineStrArr[14]));
                bank.setPreviousTransactionDate(LocalDateTime.parse(lineStrArr[15],formatter));

                bankDetail.add(bank);
            }

            ArrayList<BankTransact> filteredByAgeList = ageBetween(bankDetail);

            ageWriteToCsvFile(filteredByAgeList);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static ArrayList<BankTransact> ageBetween(ArrayList<BankTransact> list) {

        ArrayList<BankTransact> filteredByAgeList = new ArrayList<>();

        for (BankTransact age : list){
            if (age.getCustomerAge() > 30 && age.getCustomerAge() < 55){
                System.out.println(age);
                System.out.println(filteredByAgeList);
            }
        }
        return filteredByAgeList;
    }

    private static void ageWriteToCsvFile(ArrayList<BankTransact> list){

        try{
            FileWriter writer = new FileWriter("bank/bank.csv");

            ArrayList<String> filteredTnxList = new ArrayList<>();

            StringBuffer br = new StringBuffer();

            br.append("TransactionID,AccountId,TransactionAmount,TransactionDateTime,TransactionType"+",Location,DeviceID,IpAddress,MerchantId,Channel,CustomerAge,CustomerOccupation" + ",TransactionDuration,LoginAttempts,AccountBalance,PreviousTransactionDate");

            writer.write(br + "\n");

            for (BankTransact txn : list){

                StringBuffer sb = new StringBuffer();

                filteredTnxList.add(sb.append(txn.getTransactionId()).append(",")
                                .append(txn.getAccountId()).append(",")
                                .append(txn.getTransactionAmount()).append(",")
                                .append(txn.getTransactionDateTime()).append(",")
                                .append(txn.getTransactionType()).append(",")
                                .append(txn.getLocation()).append(",")
                                .append(txn.getDeviceID()).append(",")
                                .append(txn.getIpAddress()).append(",")
                                .append(txn.getMerchantId()).append(",")
                                .append(txn.getChannel()).append(",")
                                .append(txn.getCustomerAge()).append(",")
                                .append(txn.getCustomerOccupation()).append(",")
                                .append(txn.getTransactionDuration()).append(",")
                                .append(txn.getLoginAttempts()).append(",")
                                .append(txn.getAccountBalance()).append(",")
                                .append(txn.getPreviousTransactionDate()).append(",")
                        .toString());
            }

            for (String record : filteredTnxList){
                writer.write(record + "\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
