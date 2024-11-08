package com.prince.learningdsa.sorting;

public class MoveZeroesToEnd {
    static void swapTheNumber(int [] arr , int j ){
        int  temp = arr[j];
        arr [j] = arr[j+1];
        arr[j+1] = temp ;
    }
    static void movingZeroes(int[] arr, int n ) {
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] == 0 && arr[j+1] != 0) {
                    swapTheNumber(arr , j);
                }
            }
        }
    }
    public static void main(String[] args) {

         int [] arr = {0 , 5, 0 ,3, 42 , 0 , 32} ;
         int n = arr.length ;
         movingZeroes(arr , n ) ;

         for(int i: arr){
             System.out.print(" "+i);
         }
     }
}
