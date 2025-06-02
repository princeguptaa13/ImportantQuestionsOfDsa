package com.prince.leetCode;


import java.sql.SQLOutput;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] arr = {10 , 7 , 5 , 8 , 11 , 9};
        System.out.println("Array should be = "+arr[0]);
        int min_value = arr[0];
        int max_profit = 0 ;
        for(int i = 1 ; i < arr.length ; i ++){
            int cost = arr[i] - min_value ;
            max_profit = Math.max(max_profit , cost);
            min_value = Math.min(min_value , arr[i]);
        }

        System.out.println("Maximum Profit will be "+max_profit);

    }
}
