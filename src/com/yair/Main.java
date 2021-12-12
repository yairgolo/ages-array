package com.yair;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {43, 54, 35, 75, 7, 46, 6, 74, 7, 79, 34, 53};
        int[] newArr = sortAgesArray(arr);
        System.out.println(Arrays.toString(newArr));
    }

/*    private static int[] sortAgesArray(int[] arr){
        boolean[] allAges = new boolean[120];
        int[] newArr = new int[arr.length];
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            allAges[arr[i]] = true;
        }
        for (int i = 0; i < allAges.length; i++) {
            if (allAges[i]){
                newArr[counter] = i;
                counter++;
            }
        }
        return newArr;
    }*/
    
    private static int[] sortAgesArray(int[] arr) {
        int[] allAges = new int[120];
        int[] newArr = new int[arr.length];
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            allAges[arr[i]]++;
        }
        for (int i = 0; i < allAges.length; i++) {
            while (allAges[i] > 0){
                newArr[counter] = i;
                counter++;
                allAges[i]--;
            }
        }
        return newArr;
    }
}
