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
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LoanDatabase {

    static ArrayList<LoanTest> loan = new ArrayList<>();

    public static void main(String[] args) {

        Path cwd = Path.of("").toAbsolutePath();

        try {
            BufferedReader br = new BufferedReader(new FileReader(cwd + "/data/csv file/mahil_test_loan_dataset.csv"));

            String line;

            int lineCnt = 1;

            while ((line = br.readLine()) != null) {

                if (lineCnt == 1) {
                    lineCnt++;
                    continue;
                }

                String[] lines = line.split(",");

                LoanTest loanTest = new LoanTest();

                loanTest.setApplicationDate(lines[0]);
                loanTest.setAge(Integer.parseInt(lines[1]));
                loanTest.setAnnualIncome(Integer.parseInt(lines[2]));
                loanTest.setCreditScore(Integer.parseInt(lines[3]));
                loanTest.setEmploymentStatus(lines[4]);
                loanTest.setEducationalLevel(lines[5]);
                loanTest.setExperience(Integer.parseInt(lines[6]));
                loanTest.setLoanAmount(Integer.parseInt(lines[7]));
                loanTest.setLoanDuration(Integer.parseInt(lines[8]));
                loanTest.setMaritalStatus(lines[9]);
                loanTest.setNumberOfDependents(Integer.parseInt(lines[10]));
                loanTest.setHomeOwnershipStatus(lines[11]);
                loanTest.setMonthlyDebtPayments(Integer.parseInt(lines[12]));
                loanTest.setCreditCardUtilizationRate(Double.parseDouble(lines[13]));
                loanTest.setNumberOfOpenCreditLines(Integer.parseInt(lines[14]));
                loanTest.setNumberOfCreditInquiries(Integer.parseInt(lines[15]));
                loanTest.setTotalDebtToIncomeRatio(Double.parseDouble(lines[16]));
                loanTest.setBankruptcyHistory(Integer.parseInt(lines[17]));
                loanTest.setLoanPurpose(lines[18]);
                loanTest.setPreviousLoanDefaults(Integer.parseInt(lines[19]));
                loanTest.setPaymentHistory(Integer.parseInt(lines[20]));
                loanTest.setLengthOfCreditHistory(Integer.parseInt(lines[21]));
                loanTest.setSavingsAccountBalance(Integer.parseInt(lines[22]));
                loanTest.setCheckingAccountBalance(Integer.parseInt(lines[23]));
                loanTest.setTotalAssets(Integer.parseInt(lines[24]));
                loanTest.setTotalLiabilities(Integer.parseInt(lines[25]));
                loanTest.setMonthlyIncome(Double.parseDouble(lines[26]));
                loanTest.setUtilityBillsPaymentHistory(Double.parseDouble(lines[27]));
                loanTest.setJobTenure(Integer.parseInt(lines[28]));
                loanTest.setNetWorth(Integer.parseInt(lines[29]));
                loanTest.setBaseInterestRate(Double.parseDouble(lines[30]));
                loanTest.setInterestRate(Double.parseDouble(lines[31]));
                loanTest.setMonthlyLoanPayment(Double.parseDouble(lines[32]));
                loanTest.setTotalDebtToIncomeRatio(Double.parseDouble(lines[33]));
                loanTest.setLoanApproved(Integer.parseInt(lines[34]));
                loanTest.setRiskScore(Double.parseDouble(lines[35]));

                loan.add(loanTest);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        LoanDatabase loanTest = new LoanDatabase();

        loanTest.startIngestion();
    }

    public void startIngestion() {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        int totalSize = loan.size();
        int chunkSize = (int) Math.ceil((double) totalSize / 2);

        for (int i = 0; i < 2; i++) {

            int start = i * chunkSize;
            int end = Math.min(start + chunkSize, totalSize);

            if (start < totalSize) {
                List<LoanTest> sublist = loan.subList(start, end);
                executorService.submit(new PartDataProcessor(sublist));
            }
        }
        executorService.shutdown();
    }

    class PartDataProcessor implements Runnable {

        List<LoanTest> partData;

        public PartDataProcessor(List<LoanTest> partData) {
            this.partData = partData;
        }

        @Override
        public void run() {

            System.out.println("PartData:" + partData.size());

            String insertQuerry = "INSERT INTO loan(ApplicationDate,Age,AnnualIncome,CreditScore,EmploymentStatus,EducationLevel,Experience,LoanAmount,LoanDuration,MaritalStatus,NumberOfDependents,HomeOwnershipStatus,MonthlyDebtPayments,CreditCardUtilizationRate,NumberOfOpenCreditLines,NumberOfCreditInquiries,DebtToIncomeRatio,BankruptcyHistory,LoanPurpose,PreviousLoanDefaults,PaymentHistory,LengthOfCreditHistory,SavingsAccountBalance,CheckingAccountBalance,TotalAssets,TotalLiabilities,MonthlyIncome,UtilityBillsPaymentHistory,JobTenure,NetWorth,BaseInterestRate,InterestRate,MonthlyLoanPayment,TotalDebtToIncomeRatio,LoanApproved,RiskScore)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement preparedStatement = null;
            Connection connection = null;

            try {
                connection = DBUtil.getConnection();
                preparedStatement = connection.prepareStatement(insertQuerry);


            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            try {
                int insertCount = 0;

                for (LoanTest x : partData) {

                    preparedStatement.setString(1, x.getApplicationDate());
                    preparedStatement.setInt(2, x.getAge());
                    preparedStatement.setInt(3, x.getAnnualIncome());
                    preparedStatement.setInt(4, x.getCreditScore());
                    preparedStatement.setString(5, x.getEmploymentStatus());
                    preparedStatement.setString(6, x.getEducationalLevel());
                    preparedStatement.setInt(7, x.getExperience());
                    preparedStatement.setInt(8, x.getLoanAmount());
                    preparedStatement.setInt(9, x.getLoanDuration());
                    preparedStatement.setString(10, x.getMaritalStatus());
                    preparedStatement.setInt(11, x.getNumberOfDependents());
                    preparedStatement.setString(12, x.getHomeOwnershipStatus());
                    preparedStatement.setInt(13, x.getMonthlyDebtPayments());
                    preparedStatement.setDouble(14, x.getCreditCardUtilizationRate());
                    preparedStatement.setInt(15, x.getNumberOfOpenCreditLines());
                    preparedStatement.setInt(16, x.getNumberOfCreditInquiries());
                    preparedStatement.setDouble(17, x.getDebtToIncomeRatio());
                    preparedStatement.setInt(18, x.getBankruptcyHistory());
                    preparedStatement.setString(19, x.getLoanPurpose());
                    preparedStatement.setInt(20, x.getPreviousLoanDefaults());
                    preparedStatement.setInt(21, x.getPaymentHistory());
                    preparedStatement.setInt(22, x.getLengthOfCreditHistory());
                    preparedStatement.setInt(23, x.getSavingsAccountBalance());
                    preparedStatement.setInt(24, x.getCheckingAccountBalance());
                    preparedStatement.setInt(25, x.getTotalAssets());
                    preparedStatement.setInt(26, x.getTotalLiabilities());
                    preparedStatement.setDouble(27, x.getMonthlyIncome());
                    preparedStatement.setDouble(28, x.getUtilityBillsPaymentHistory());
                    preparedStatement.setInt(29, x.getJobTenure());
                    preparedStatement.setInt(30, x.getNetWorth());
                    preparedStatement.setDouble(31, x.getBaseInterestRate());
                    preparedStatement.setDouble(32, x.getInterestRate());
                    preparedStatement.setDouble(33, x.getMonthlyLoanPayment());
                    preparedStatement.setDouble(34, x.getTotalDebtToIncomeRatio());
                    preparedStatement.setInt(35, x.getLoanApproved());
                    preparedStatement.setDouble(36, x.getRiskScore());

                    preparedStatement.executeUpdate();

                    insertCount++;
                }
                System.out.println("Inserted count:" + insertCount + " Completed");

            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                DBUtil.closeResources(connection, preparedStatement);
            }
        }
    }
}