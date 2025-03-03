package com.pavi.learning.java.map;

import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args){

        TreeMap<String,Integer> stockprices = new TreeMap<>();

        stockprices.put("Microsoft",299);
        stockprices.put("Google",2800);
        stockprices.put("Apple",150);

        System.out.println("Stock prices in sorted order:");
        for(String company : stockprices.keySet()){
            System.out.println("Comapny:" +company + ", Prices: $" +stockprices.get(company));
        }
    }
}
