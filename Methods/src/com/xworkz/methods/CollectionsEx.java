package com.xworkz.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsEx {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(3, 5, 1, 5, 2));

        Collections.sort(list);
        System.out.println("Sorted: " + list);

        Collections.reverse(list);
        System.out.println("Reversed: " + list);

        Collections.shuffle(list);
        System.out.println("Shuffled: " + list);

        int max = Collections.max(list);
        System.out.println("Max: " + max);

        int min = Collections.min(list);
        System.out.println("Min: " + min);

        int freq = Collections.frequency(list, 5);
        System.out.println("Frequency of 5: " + freq);

        Collections.replaceAll(list, 5, 50);
        System.out.println("Replaced 5 with 50: " + list);

        List<Integer> copyList = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));
        Collections.copy(copyList, list);
        System.out.println("Copied List: " + copyList);

        Collections.fill(copyList, 7);
        System.out.println("Filled with 7: " + copyList);

        Collections.swap(list, 0, 2);
        System.out.println("After swapping index 0 and 2: " + list);

        Collections.sort(list);
        int index = Collections.binarySearch(list, 1);
        System.out.println("Index of 1: " + index);

        List<Integer> list2 = new ArrayList<>(Arrays.asList(10, 20));
        list.addAll(list2);
        System.out.println("After addAll: " + list);

        list.removeAll(list2);
        System.out.println("After removeAll: " + list);

        boolean containsAll = list.containsAll(Arrays.asList(1, 2));
        System.out.println("Contains all [1, 2]: " + containsAll);

        System.out.println("Is Empty? "+list.isEmpty());
    }
}
