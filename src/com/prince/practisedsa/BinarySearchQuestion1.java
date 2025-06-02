package com.prince.practisedsa;

import java.util.Scanner;

public class BinarySearchQuestion1 {
   static int binarySearchAlgo(int[] arr , int target , int n){
        int start = 0 ;
        int end = n-1 ;
        while(start <= end){
            int mid = (start + end)/ 2 ;
            if(arr[mid] == target) {
                return mid ;
            }else if (target < arr[mid]){
                end = mid - 1 ;
            }else if (target > arr[mid]){
                start = mid + 1 ;
            }
        }
        return -1 ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter value of target = ");
        int target = sc.nextInt();

        int [] arr = {-3 , 0 , 1 , 3 , 5 , 9 , 12};
        int n = arr.length;

        int val =  binarySearchAlgo(arr,target,n);
        System.out.println(" " +val);
    }
}
