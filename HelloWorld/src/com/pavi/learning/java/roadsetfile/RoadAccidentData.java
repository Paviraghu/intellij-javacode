package com.pavi.learning.java.roadtestfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;

public class RoadAccidentData {

    public static void main(String[] args) throws IOException {

        Path cwd = Path.of("").toAbsolutePath();

        BufferedReader br = new BufferedReader(new FileReader(cwd + "/data/csv file/road_accident_dataset.csv"));

        ArrayList<String> countries = new ArrayList<>();
        ArrayList<String> months = new ArrayList<>();


        String line;

        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");

            String country = data[0];
            String month = data[2];


            countries.add(country);
            months.add(month);

        }
        br.close();

        sortAndPrint("Countries with Highest Accidents:", countries);
        sortAndPrint("Months with Highest Incidents:", months);
    }

    static void sortAndPrint(String title, ArrayList<String> list) {

        ArrayList<String> unique = new ArrayList<>();

        for (String item : list) if (!unique.contains(item)) unique.add(item);

        unique.sort((a, b) -> Collections.frequency(list, b) - Collections.frequency(list, a));

        System.out.println("\n" + title);
        for (String item : unique)
            System.out.println(item + " - " + Collections.frequency(list, item));
    }
}
