package com.prince.learningdsa.sorting;

import java.util.Scanner;

public class BubbleSorting {
    static void swap(int [] arr, int j){
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp ;
    }
    static void increasingorder(int [] arr){
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
               if(arr[j] > arr[j+1]){swap(arr,j);}
            }
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of an array = ");
       int n = sc.nextInt();

       int[] arr= new int[n];
       System.out.println("Enter the values = ");
       for(int i=0;i<arr.length;i++) {
           arr[i] = sc.nextInt();
       }

        increasingorder(arr);

        for (int i : arr){
            System.out.print(i+ " ");
        }

    }
}
