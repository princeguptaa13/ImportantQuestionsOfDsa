package com.prince.learningdsa.Arrays;


import java.util.Arrays;

public class MissingNumber {
    static int missingNumber(int [] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int totalSum = n * (n+1) / 2 ;
        int arraySum = 0 ;
        for(int i=0 ; i<n ; i++){
            arraySum = arraySum + arr[i];
        }
        return totalSum - arraySum ;
    }
    public static void main(String[] args) {
        int [] arr ={4 , 1 , 2 , 0};
       // Arrays.sort(arr);

        int cal = missingNumber(arr);
        System.out.print(" " +cal);
    }
}
