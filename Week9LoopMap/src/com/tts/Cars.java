package com.tts;

import java.util.*;



public class Cars{

    public static void carLot(){

        Scanner scan = new Scanner(System.in);

        HashMap<String, String> carList = new HashMap<>();

        carList.put("beetle", "Volkswagen");
        carList.put("Mustang", "Ford");
        carList.put("911", "Porsche");
        carList.put("Pilot", "Honda");
        carList.put("Highlander", "Toyota");
        carList.put("Prius", "Toyota");


        System.out.println("What Model Car Are You Looking For Today?");
        String carModel = scan.next();
        //Search Inventory For User's Request
        String output = carList.get(carModel);
        if (output == null) {
            System.out.println("Doesn't look like we have that model in stock.");
        } else {
            System.out.println("We have a " + carModel +  ". " + "The " + output + "s are  over here.");
        }

    }
}