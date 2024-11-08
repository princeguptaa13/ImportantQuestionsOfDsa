package com.prince.learningdsa.Arrays;

public class LeftRotateTheArrayByOne {
    static void leftRotate(int [] arr , int n) {
        int[] temp = new int[n];
        int i;
        for (i = 1; i < n; i++) {
            temp[i - 1] = arr[i];
        }
        temp[n - 1] = arr[0];
        for (int j = 0; j < n; j++) {
            System.out.print(" " + temp[j]);
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int n = arr.length;
         leftRotate(arr,n);
        //System.out.println(" ");
    }
}
