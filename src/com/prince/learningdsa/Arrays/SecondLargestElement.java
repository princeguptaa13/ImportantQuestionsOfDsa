package com.prince.learningdsa.Arrays;

public class SecondLargestElement {
    static void findingSecondLargest (int arr []) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            }
        int secondMax=0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > Integer.MIN_VALUE && arr[j] < max) {
                 secondMax = arr[j];
            }
        }
        System.out.println(" " + secondMax);

    }
    public static void main(String[] args) {
        int [] arr = {8 , 7 , 3 , 1 , 56 , 90} ;

        findingSecondLargest(arr);

    }

}
