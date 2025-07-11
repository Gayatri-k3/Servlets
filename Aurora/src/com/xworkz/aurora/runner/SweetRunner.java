package com.xworkz.aurora.runner;

import com.xworkz.aurora.dto.SweetDTO;
import com.xworkz.aurora.repository.SweetRepository;
import com.xworkz.aurora.repository.SweetRepositoryImpl;

import java.util.*;

public class SweetRunner {
    public static void main(String[] args) {
        SweetRepository sweetRepository = new SweetRepositoryImpl();
        Set<SweetDTO> set = sweetRepository.findAll();

        System.out.println("4. Sort all elements by price in desc using TreeSet");
        Set<SweetDTO> tree = new TreeSet<>((a,b)-> {
            int priceComp = Double.compare(b.getPrice(), a.getPrice());
            return (priceComp!=0)? priceComp: b.getName().compareTo(a.getName());
            });
        tree.addAll(set);
        tree.forEach(System.out::println);

        System.out.println("================================================");
        System.out.println("5. Sort all elements by name and price in desc");
        List<SweetDTO> list = new ArrayList<>(set);
        list.stream().sorted((a,b)-> {
            int nameComp = b.getName().compareTo(a.getName());
            return (nameComp != 0) ? nameComp : Double.compare(b.getPrice(), a.getPrice());
        }).forEach(System.out::println);

        System.out.println("================================================");
        List<SweetDTO> linked = new LinkedList<>(set);
        System.out.println("Set to LinkedList");
        linked.forEach(System.out::println);

    }
}
