package com.pavi.learning.java.testoperationspecified;


import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;

public class ProcessOperationApp {

    static ArrayList<DataBean> dataBeanList = new ArrayList<>();

    static Path cwd = Path.of("").toAbsolutePath();

    public static void main(String[] args) {

        ProcessOperationApp r = new ProcessOperationApp();
        r.readData();

        doCalculation();
        writeToFile();

    }

    //non static
    private void readData() {

        try{
            BufferedReader reader = new BufferedReader(new FileReader(cwd+"/operation/arith_test.csv"));

            String line;
            int lineCnt=0;

            while ((line  = reader.readLine()) !=null){
                System.out.println(line);
                if (lineCnt==0){
                    lineCnt++;
                    continue;
                }

                DataBean dataBean = new DataBean();
                String[] row = line.split(",");
                dataBean.setInputA(Integer.parseInt(row[0]));
                dataBean.setInputB(Integer.parseInt(row[1]));
                dataBean.setAction(row[2]);
                dataBean.setResult(0);
                dataBeanList.add(dataBean);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void doCalculation(){

        System.out.println(dataBeanList.size());

        for (DataBean data: dataBeanList){

            String action= data.getAction();

            switch (action){
                case "Add":
                    data.setResult(Calculation.add(data.getInputA(),data.getInputB()));
                    System.out.println(data);
                    break;
                case "Sub":
                    data.setResult(Calculation.sub(data.getInputA(),data.getInputB()));
                    System.out.println(data);
                    break;
                case "Multiply":
                    data.setResult(Calculation.multiply(data.getInputA(),data.getInputB()));
                    break;
                case "Divide":
                    data.setResult(Calculation.divide(data.getInputA(),data.getInputB()));
                    break;
                default:
                    System.out.println("Invalid action:"+action);
                    break;
            }
        }
    }

    private static void writeToFile(){

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(cwd+"resultprint.csv"));
            writer.write("inputA,inputB,action,result\n");

            for (DataBean operation: dataBeanList){
                writer.write(operation.getInputA()+","+operation.getInputB()+","+operation.getAction()+","+operation.getResult()+"\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
