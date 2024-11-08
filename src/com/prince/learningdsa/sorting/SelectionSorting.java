package com.prince.learningdsa.sorting;

public class SelectionSorting {
    static void sortingalgo2 (int[] arr){
        int n = arr.length;
        for (int i = 0 ;i<n-1;i++){
            int min_idx = i ;
            for(int j=i+1 ;j<n;j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
                    int temp =arr[min_idx];
                    arr[min_idx] = arr [i] ;
                    arr [i] = temp ;


        }
    }
    public static void main(String[] args) {
        int [] arr = {40,3,12,3,19,7};

        sortingalgo2(arr);
        for ( int i=0;i<arr.length;i++){
            System.out.print("" +arr[i]);
        }

    }
}
