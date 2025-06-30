package com.xworkz.methods;

import java.util.Arrays;

public class ArraysEx {
    public static void main(String[] args) {

        int[] arr1 = {2, 9, 6};
        int[] arr2 = {7, 6, 1};

        Arrays.sort(arr1);
        System.out.println("Sorted arr1: " + Arrays.toString(arr1));

        int searchIndex = Arrays.binarySearch(arr1, 9);
        System.out.println("Index of 9 in arr1: " + searchIndex);

        boolean isEqual = Arrays.equals(arr1, arr2);
        System.out.println("arr1 equals arr2: " + isEqual);

        int hashCode = Arrays.hashCode(arr1);
        System.out.println("Hash code of arr1: " + hashCode);

        int[] copy = Arrays.copyOf(arr1, 7);
        System.out.println("Copy of arr1 (length 7): " + Arrays.toString(copy));

        int[] range = Arrays.copyOfRange(arr1, 1, 2);
        System.out.println("Copy range from arr1 (1 to 2): " + Arrays.toString(range));

        Arrays.fill(arr1, 3);
        System.out.println("Filled arr1 with 3: " + Arrays.toString(arr1));

        int[] squares = new int[4];
        Arrays.setAll(squares, i -> i * i);
        System.out.println("Squares using setAll: " + Arrays.toString(squares));

        Arrays.parallelSort(arr2);
        System.out.println("Parallel sorted arr2: " + Arrays.toString(arr2));

        String joined = Arrays.toString(arr2);
        System.out.println("Joined arr2: " + joined);

        boolean deepEqual = Arrays.deepEquals(new int[][]{arr1}, new int[][]{arr2});
        System.out.println("Deep equals of arr1 and arr2: " + deepEqual);

        int[] cloned = arr1.clone();
        System.out.println("Cloned arr1: " + Arrays.toString(cloned));

        String[] fruits = {"Apple", "Banana", "Cherry"};
        System.out.println("As List: " + Arrays.asList(fruits));

        int[][] matrix = {{1, 2}, {3, 4}};
        System.out.println("2D Array: " + Arrays.deepToString(matrix));

        int[] nums = {10, 20, 30, 40, 50};
        int[] partial = Arrays.copyOfRange(nums, 1, 4);
        System.out.println("Partial copy: " + Arrays.toString(partial));
    }
}
