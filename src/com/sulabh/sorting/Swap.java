package com.sulabh.sorting;

//to swap values in the given array by their index
public class Swap {

    public static void swap(int[] arr, int indexOne, int indexTwo){
        int temp = arr[indexTwo];
        arr[indexTwo] = arr[indexOne];
        arr[indexOne] = temp;
    }
}
