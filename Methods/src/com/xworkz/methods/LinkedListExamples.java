package com.xworkz.methods;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExamples {
    public static void main(String[] args) {
        LinkedList<String> list1=new LinkedList<>();
        list1.add("Hubballi");
        list1.add("Puri");
        list1.add("Varanasi");
        list1.add("Leh");
        list1.add("Shillong");
        for (String list : list1) {
            System.out.println(list);
        }


        System.out.println("=====================================");
        LinkedList<String> list2=new LinkedList<>();
        list2.add("Hubballi");
        list2.add("Java");
        list2.add("Varanasi");
        list2.add("Leh");
        list2.add("Shillong");
        System.out.println("Contains Java? "+list2.contains("Java"));


        System.out.println("=====================================");
        System.out.println("Size of List: "+list2.size());


        System.out.println("=====================================");
        list2.add(1,"UpdatedValue");
        for (String list : list2) {
            System.out.println(list);
        }


        System.out.println("=====================================");
        LinkedList<String> list3=new LinkedList<>();
        list3.add("Hi");
        list3.add("Hello");
        list3.add("Hey");
        System.out.println("Contains Hello? "+list3.contains("Hello"));



        System.out.println("=====================================");
        List<Integer> list4=new LinkedList<>();
        list4.add(1256);
        list4.add(999);
        list4.add(70);
        list4.add(126);
        System.out.println("Maximum: "+ Collections.max(list4));


        System.out.println("=====================================");
        List<Integer> list5=new LinkedList<>();
        list5.add(1256);
        list5.add(999);
        list5.add(70);
        list5.add(126);
        for(int i=0;i< list5.size();i++){
            System.out.println(i+" : "+list5.get(i));
        }
    }
}
