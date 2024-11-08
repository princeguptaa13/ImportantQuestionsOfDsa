package com.prince.learningdsa.Arrays;

public class SecondLargestElement2 {
    static void findingSecondLargest2_0(int arr[]){
        int largest = Integer.MIN_VALUE ;
        int secondLargest = Integer.MIN_VALUE ;
        int n = arr.length;
        for (int i = 0 ; i < n ; i++){
            if (arr[i] > largest){
                secondLargest = largest ;
                largest = arr[i] ;
            }else{
                if(secondLargest<arr[i] && secondLargest<largest){
                    secondLargest = arr[i] ;
                }
            }
        }
        System.out.println(" " +secondLargest);

    }

    public static void main(String[] args) {
        int [] arr = {-53, -55 ,-500 , 2 , -69 , -34};

        findingSecondLargest2_0(arr) ;

    }
}
