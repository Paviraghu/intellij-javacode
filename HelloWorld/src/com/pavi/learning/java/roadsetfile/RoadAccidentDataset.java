package com.pavi.learning.java.roadtestfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;

public class RoadAccidentDataset {

    static ArrayList<RoadAccident> road = new ArrayList<>();

    public static void main(String[] args) {

        Path cwd = Path.of("").toAbsolutePath();

        try {
            BufferedReader br = new BufferedReader(new FileReader(cwd + "/data/csv file/road_accident_dataset.csv"));

            String line;

            int lineCnt = 0;
            while ((line = br.readLine()) != null) {
                if (lineCnt == 0) {
                    System.out.println(line);
                    lineCnt++;
                    continue;
                }

                String[] lineStrArr = line.split(",");

                RoadAccident roadAccident = new RoadAccident();

                roadAccident.setCountry(lineStrArr[0]);
                roadAccident.setYear(Integer.parseInt(lineStrArr[1]));
                roadAccident.setMonth(lineStrArr[2]);
                roadAccident.setDayOfWeek(lineStrArr[3]);
                roadAccident.setTimeOfDay(lineStrArr[4]);
                roadAccident.setUrbanRural(lineStrArr[5]);
                roadAccident.setRoadType(lineStrArr[6]);
                roadAccident.setWeatherConditions(lineStrArr[7]);
                roadAccident.setVisibilityLevel(Double.parseDouble(lineStrArr[8]));
                roadAccident.setNumberOfVehiclesInvolved(Integer.parseInt(lineStrArr[9]));
                roadAccident.setSpeedLimit(Integer.parseInt(lineStrArr[10]));
                roadAccident.setDriverAgeGroup(lineStrArr[11]);
                roadAccident.setDriverGender(lineStrArr[12]);
                roadAccident.setDriverAlcoholLevel(Double.parseDouble(lineStrArr[13]));
                roadAccident.setDriverFatigue(Integer.parseInt(lineStrArr[14]));
                roadAccident.setVehicleCondition(lineStrArr[15]);
                roadAccident.setPedestriansInvolved(Integer.parseInt(lineStrArr[16]));
                roadAccident.setCyclistsInvolved(Integer.parseInt(lineStrArr[17]));
                roadAccident.setAccidentSeverity(lineStrArr[18]);
                roadAccident.setNumberOfInjuries(Integer.parseInt(lineStrArr[19]));
                roadAccident.setNumberOfFatalities(Integer.parseInt(lineStrArr[20]));
                roadAccident.setEmergencyResponseTime(Double.parseDouble(lineStrArr[21]));
                roadAccident.setTrafficVolume(Double.parseDouble(lineStrArr[22]));
                roadAccident.setRoadCondition(lineStrArr[23]);
                roadAccident.setAccidentCause(lineStrArr[24]);
                roadAccident.setInsuranceClaims(Integer.parseInt(lineStrArr[25]));
                roadAccident.setMedicalCost(Double.parseDouble(lineStrArr[26]));
                roadAccident.setEconomicLoss(Double.parseDouble(lineStrArr[27]));
                roadAccident.setRegion(lineStrArr[28]);
                roadAccident.setPopulationDensity(Double.parseDouble(lineStrArr[29]));

                road.add(roadAccident);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (RoadAccident entry : road) {
            System.out.println(entry);
        }
    }
}

