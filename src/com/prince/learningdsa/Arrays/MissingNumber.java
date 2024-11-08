package com.prince.learningdsa.Arrays;

public class MissingNumber {
    static int missingNumber(int [] arr){
        int n = arr.length ;
       for(int i = 0 ; i < n-1 ; i++){
           for(int j = i+1 ; j < n  ; j++){
               if(arr[i] < arr[j] && (arr[j] - arr[i]) == 1){
                   return i;
               }else if (arr[i] < arr[j] && (arr[j] - arr[i]) == 2){
                   return i+1;
               }
           }
       }
       return 1 ;
    }
    public static void main(String[] args) {
        int [] arr ={1 , 2 , 4};
        int cal = missingNumber(arr);
        System.out.print(" " +cal);
    }
}
