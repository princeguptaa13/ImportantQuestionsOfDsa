package com.prince.learningdsa.Arrays;

public class CountMaximumConsecutive {
    static int maximumConsecutive(int[] nums){
        int count = 0;
        int maxi = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            if (nums[i] == 1) {
                count ++ ;
            }else if (nums[i] == 0){
                count = 0 ;
            }
            maxi = Math.max(maxi , count);
        }
        return maxi ;
    }

    public static void main(String[] args) {
        int [] nums = {1 , 0 , 1 , 1 , 1 , 0 , 0 ,1};

        int val = maximumConsecutive(nums);
        System.out.println(" "+val);
    }
}
