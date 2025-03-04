package com.pavi.learning.java.testoperationspecified;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;

public class OperationSpecified {

    static String aa;

    static ArrayList<FileInput> file = new ArrayList<>();

    public static void main(String[] args) {

        Path cwd = Path.of("").toAbsolutePath();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(cwd + "/operation/arith_test.csv"));

            String line;
            int lineCnt = 0;

            while ((line = reader.readLine()) != null) {

                if (lineCnt == 0) {
                    System.out.println(line);
                    aa=line;
                    lineCnt++;
                    continue;
                }

                String[] row = line.split(",");

                FileInput fileInput = new FileInput();

                fileInput.setInputA(Long.parseLong(row[0]));
                long c = Long.parseLong(row[0]);
                fileInput.setInputB(Long.parseLong(row[1]));
                long d = Long.parseLong(row[1]);
                fileInput.setAction(row[2]);

                long a=0;

                switch (row[2]){
                    case "Add":
                        a=addition(c,d);
                        break;
                    case "Sub":
                        a=subtraction(c,d);
                        break;
                    case "Multiply":
                        a=multiplication(c,d);
                        break;
                    case "Divide":
                        a=division(c,d);
                        break;
                }

                fileInput.setResult(a);
                file.add(fileInput);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        fileWriter();
    }

    private static long addition(long c, long d) {
        long result = c+d;
        return result;
    }

    private static long subtraction(long c,long d){
        long result = c-d;
        return result;
    }

    private static long multiplication(long c,long d){
        long result = c*d;
        return result;
    }

    private static long division(long c,long d){
        long result = c/d;
        return result;
    }

    private static void fileWriter(){

        try{
            FileWriter writer = new FileWriter("result.csv");

            writer.write(aa+"\n");

            for (FileInput fileList:file){

                writer.write(fileList.getInputA()+","+fileList.getInputB()+","+fileList.getAction()+","+fileList.getResult());
                System.out.println(fileList);
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
