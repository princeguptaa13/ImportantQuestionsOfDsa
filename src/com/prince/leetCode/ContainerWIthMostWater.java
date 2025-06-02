package com.prince.leetCode;

import java.util.Scanner;

public class ContainerWIthMostWater {
    public static void containerWIthMostWaterSol(int[] arr){
        int i = 0;
        int height = arr[i];
        for( i=0 ; i<height ; i++){
            for(int j=0 ; j<arr.length ; j++){
             if(arr[i] == Math.max( i , j) ){
                 int area = (arr[i]*arr[j]);
             }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,8,6,2,5,4,3,7};
        for(int i=0;i<arr.length ;i++){
            System.out.print(arr[i]);
        }

        System.out.println();

        containerWIthMostWaterSol(arr);
        for(int i=0;i<arr.length ;i++){
            System.out.print(arr[i]);
        }

    }


    }

