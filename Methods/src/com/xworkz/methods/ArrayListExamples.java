package com.xworkz.methods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExamples {
    public static void main(String[] args) {
        Collection<Integer> collection1 = new ArrayList<>();
        for(int i=1; i<=10;i++){
            collection1.add(i);
        }
        System.out.println(collection1);



        System.out.println("====================================");
        Collection<Integer> collection2 = new ArrayList<>();
        for(int i=40; i<=60;i++){
            collection2.add(i);
        }
        Iterator<Integer> iterator2 = collection2.iterator();
        while(iterator2.hasNext()){
            Integer collections2 = iterator2.next();
            if(collections2 > 50){
                iterator2.remove();
            }
        }
        System.out.println(collection2);



        System.out.println("====================================");
        ArrayList<String> collection3 = new ArrayList<>();
        collection3.add("India");
        collection3.add("China");
        collection3.add("New Zealand");
        collection3.add("Korea");
        Collections.sort(collection3);
        for (String country : collection3) {
            System.out.println(country);
        }


        System.out.println("====================================");
        ArrayList<Integer> collection4 = new ArrayList<>();
        for(int i=40; i<=60;i++){
            collection4.add(i);
        }
        collection4.add(2,99);
        System.out.println(collection4);


        System.out.println("====================================");
        ArrayList<String> collection5 = new ArrayList<>();
        collection5.add("India");
        collection5.add("China");
        collection5.add("New Zealand");
        collection5.add("Korea");
        System.out.println("before reversing: "+collection5);
        Collections.reverse(collection5);
        System.out.println("after reversing: "+collection5);


        System.out.println("====================================");
        collection4.clear();
        System.out.println("Removed all elements from collection4? "+collection4.isEmpty());




    }
}
