package com.prince.learningdsa.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    static boolean binarySearchAlgo(int [] arr, int k) {
        int n = arr.length;
        int strt = 0;
        int end = n-1;

        while (strt <= end) {
            int mid = (strt + end) / 2;
            if (arr[mid] == k) {
                return true ;
            }else if(k < arr[mid]){
                    end = mid - 1 ;
            }else if(k > arr[mid]){
                    strt = mid + 1 ;
            }
        }
        return false ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {11 , 14 , 23 , 34 , 39 ,42};
        System.out.println("Array is = "+ Arrays.toString(arr));
        System.out.println("Enter value of K  = ");
        int k = sc.nextInt();
        boolean vl = binarySearchAlgo(arr,k);
        System.out.println(""+vl);
    }
}
