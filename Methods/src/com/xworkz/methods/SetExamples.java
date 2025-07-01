package com.xworkz.methods;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {
        Set<String> fruit= new HashSet<>();
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Watermelon");
        fruit.add("Muskmelon");
        fruit.add("Apple");
        System.out.println("HashSet: "+fruit);

        System.out.println("-------------------------------");
        List<String> fruitList= new ArrayList<>(fruit);
        System.out.println("List: "+fruitList);


        System.out.println("-------------------------------");
        System.out.println("Is set empty? "+fruit.isEmpty());


        System.out.println("-------------------------------");
        HashSet<Integer> integerHashSet = new HashSet<>();
        integerHashSet.add(2);
        integerHashSet.add(4);
        integerHashSet.add(6);
        integerHashSet.add(8);
        System.out.println("Before removing 6: "+integerHashSet);
        integerHashSet.remove(6);
        System.out.println("After removing 6: "+integerHashSet);


        System.out.println("-------------------------------");
        System.out.println("Contains Banana? "+fruit.contains("Banana"));

        System.out.println("-------------------------------");
        ArrayList<String> collection5 = new ArrayList<>();
        collection5.add("India");
        collection5.add("China");
        collection5.add("New Zealand");
        collection5.add("Korea");
        collection5.add("India");
        System.out.println("ArrayList: "+collection5);
        HashSet<String> countries = new HashSet<>(collection5);
        System.out.println("hashSet: "+countries);


        System.out.println("-------------------------------");
        LinkedHashSet<Integer> integers = new LinkedHashSet<>();
        integers.add(5);
        integers.add(10);
        integers.add(15);
        integers.add(10);
        integers.add(20);
        System.out.println(integers);

        System.out.println("-------------------------------");
        Iterator<Integer> iterator=integers.iterator();
        System.out.println("Using Iterator: ");
        while(iterator.hasNext()){
            Integer integer = iterator.next();
            System.out.println(integer);
        }

        System.out.println("-------------------------------");
        TreeSet<String> country = new TreeSet<>();
        country.add("India");
        country.add("China");
        country.add("New Zealand");
        country.add("Korea");
        System.out.println("TreeSet: "+country);


        System.out.println("-------------------------------");
        TreeSet<Integer> sortNum = new TreeSet<>();
        sortNum.add(98);
        sortNum.add(86);
        sortNum.add(99);
        sortNum.add(12);
        System.out.println(sortNum);

        System.out.println("-------------------------------");
        System.out.println("Highest: "+Collections.max(sortNum));
        System.out.println("Lowest: "+Collections.min(sortNum));


        System.out.println("-------------------------------");
        TreeSet<Integer> lessThan50 = new TreeSet<>();
        for(int i=40; i<=60;i++){
            lessThan50.add(i);
        }
        Iterator<Integer> iterator2 = lessThan50.iterator();
        while(iterator2.hasNext()){
            Integer collections2 = iterator2.next();
            if(collections2 < 50){
                iterator2.remove();
            }
        }
        System.out.println(lessThan50);
    }
}
