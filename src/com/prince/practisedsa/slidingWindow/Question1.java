package com.prince.practisedsa.slidingWindow;

//in this question , we will find maximum sum array
public class Question1 {

    static int slidingWindowBasics(int [] arr , int k){
        int maxSum ;
        int n = arr.length;
        int currentSum = 0 ;
        for(int i = 0 ; i < k ; i++){
          currentSum += arr[i];
        }
        maxSum = currentSum ;
        for(int j = 1 ; j < n-k ; j++){
        currentSum = currentSum-arr[j]+arr[k+1];
        if(currentSum>maxSum){
            maxSum = currentSum ;
         }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2 , 4 , 5 , 8 , 9};
        int k = 3 ;
        int swB = slidingWindowBasics(arr , k);
        System.out.println(" "+swB);
    }
}