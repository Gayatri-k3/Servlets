package com.xworkz.elixir.runner;

import java.util.HashMap;
import java.util.Map;

public class ElixirRunner {
    public static void main(String[] args) {
        Map<String,Integer> toys = new HashMap<>();
        toys.put("Train", 199);
        toys.put("Barbie Doll", 599);
        toys.put("Action Figure",200);
        toys.put("Doll House",1999);
        System.out.println("Data saved successfully: "+toys.size());
        System.out.println("-----------------------------------");

        System.out.println("Read operation");
        for(String key: toys.keySet()){
            System.out.println(key+" : "+toys.get(key));
        }

        System.out.println("-----------------------------------");
        System.out.println("Update");
        System.out.println("Before Update: Action Figure ="+toys.get("Action Figure"));
        toys.put("Action Figure",900);
        System.out.println("After Update: Action Figure ="+toys.get("Action Figure"));

        System.out.println("-----------------------------------");
        System.out.println("Remove Operation");
        toys.remove("Train");
        System.out.println("After removing Train: "+toys.size());
        toys.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
