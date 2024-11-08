package com.prince.learningdsa.Arrays;

import java.util.Scanner;

public class RotateAnArrayWthOptimalOne {
    static void reverseAnArray(int []arr , int start , int end){

        while (start < end){
            int temp = arr[start] ;
            arr[start] = arr[end] ;
            arr[end] = temp;
        start ++ ;
        end -- ;
        }
    }

    static void rotateByK(int [] arr , int k , int n ){
        k = k % n ;
        if (k < 0){
            k += n ;
        }
           //reverse the entire array
           reverseAnArray(arr ,0,n-1 );

           //reverse the first k elements
           reverseAnArray(arr ,0 ,k-1 );

           //reverse the remaining elements
           reverseAnArray(arr , k , n-1);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1 ,2 ,3 ,4 , 5 ,6 ,7};
        System.out.println("Enter Your Kth Steps : ");
        int k = sc.nextInt();
        int n = arr.length ;

       rotateByK(arr , k , n);
        System.out.println("Array after rotation : ");
        for(int i : arr){
            System.out.print(" " +i);
        }
        
    }
}
