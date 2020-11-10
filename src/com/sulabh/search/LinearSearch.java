package com.sulabh.search;

public class LinearSearch {

    //this function returns index of target element in given array
    public static int search(int[] arr, int target){

        for(int i = 0 ; i < arr.length ; i++){
            if(target == arr[i]){
                return i; //index of target element
            }
        }

        //return -1 if target element isnot present in given array
        return -1;
    }

    public static void main(String[] args) {

        int[] searchable = {5,2,14,56,47,91,88,92,50,99};
        int target = 50;

        System.out.println("Index of target : "+search(searchable,target));
    }
}
