package com.prince.learningdsa.sorting;

public class InsertionSorting {
    static void swapTheNumbers(int[] arr ,int a ,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp ;
    }
    static void sortingAlgo3(int[] arr) {
            int n = arr.length;
            for( int i = 1 ; i<n ; i++){
                int j = i ;
                while(j>0 && arr[j] < arr[j-1]){
                    swapTheNumbers(arr , j , j-1);
                    j-- ;
                }
            }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};

        sortingAlgo3(arr);
        for(int i : arr){
            System.out.print(" "+i);
        }


    }
}

