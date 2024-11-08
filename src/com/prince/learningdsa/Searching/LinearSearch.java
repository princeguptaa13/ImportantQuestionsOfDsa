package com.prince.learningdsa.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    static boolean linearSearchImplement(int [] arr , int K){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == K){
                return true ;
            }
        }
     return false ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {23 , 11 , 32 , 98 , 41 , 12 , 69 , 88};
        System.out.println("Array is = " + Arrays.toString(arr));

        System.out.print("Enter value of K from above array = ");
        int K = sc.nextInt();

        boolean val = linearSearchImplement(arr , K);
        System.out.print("boolean of selected value = " +val);

        sc.close();
    }
}
