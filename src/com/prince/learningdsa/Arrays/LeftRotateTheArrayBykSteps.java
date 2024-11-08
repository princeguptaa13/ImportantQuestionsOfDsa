package com.prince.learningdsa.Arrays;

import java.util.Scanner;

public class LeftRotateTheArrayBykSteps {
    static void leftRotate(int[] arr , int n, int k){
        k = k % n ;

        int[] temp = new int[k];

        for(int i=0;i<n;i++){
            temp [i] = arr [i];
        }

      //   for(int )




    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {2 ,3, 4 ,5 ,6 , 7};
        int n = arr.length;
        System.out.println("Enter no. of k steps = ");
        int k = sc.nextInt();
        leftRotate(arr,n,k);
    }
}
