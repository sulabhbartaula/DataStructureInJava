package com.sulabh.search;

public class BinarySearch {

    public static int search(int[] arr, int target){
        int left = 0;
        int right = arr.length;

        while (left < right){

            int mid = Math.floorDiv(left+right,2);
            int midValue = arr[mid];

            if(target == midValue){
                return mid;
            }else if(midValue < target){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] searchable = {2,13,18,25,28,35,49,55,57};
        int target = 570;

        System.out.println("Index of target element : "+search(searchable, target));
    }

}
