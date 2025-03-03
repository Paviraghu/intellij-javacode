package com.pavi.learning.java.arraycsvfile;

import java.io.*;
import java.util.ArrayList;

public class CustomerApp {

    public static void main(String[] args) {

        String csvFile = "C:/Users/admin/Desktop/datafiles/Sample Record (1).csv";
        String delimeter = ",";
        ArrayList<Customer> array = new ArrayList<>();

        try {
            File file = new File(csvFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line = "";

            int lineNo = 1;

            while ((line = br.readLine()) != null) {
                if (lineNo == 1) {
                    lineNo++;
                    continue;
                }
                String[] tempArr = line.split(delimeter);

                Customer details = new Customer();
                details.setReligion(tempArr[0]);
                details.setCountry(tempArr[1]);
                details.setItemType(tempArr[2]);
                details.setSalesChannel(tempArr[3]);
                details.setOrderPriority(tempArr[4]);
                details.setOrderDate(tempArr[5]);
                details.setOrderId(tempArr[6]);
                details.setShipDate(tempArr[7]);
                details.setUnitsSold(tempArr[8]);
                details.setUnitPrice(tempArr[9]);
                details.setUnitCost(tempArr[10]);
                details.setTotalRevenue(tempArr[11]);
                details.setTotalCost(tempArr[12]);
                details.setTotalProfit(tempArr[13]);

                array.add(details);

                System.out.println("Line:" + line);
            }
            System.out.println("Array length:" + array.size());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

