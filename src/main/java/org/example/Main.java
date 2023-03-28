package org.example;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 50, 4, 5, 6, 7, 8, 9, 10};
        SplitArray array = new SplitArray();
        System.out.println(array.splitArraySameAverage(arr));
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(array.splitArraySameAverage(arr2));
    }
}