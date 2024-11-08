package com.prince.learningdsa.Arrays;

import java.util.ArrayList;

public class RightRotateTheArrayBykSteps {
    public static void rotate(int[] nums, int k) {
        int n = nums.length ;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n ;i++){
            list.add(nums[i]);
        }
        for(int j=0; j<k; j++){
            list.add(0, list.get(list.size()-1));
            list.remove(list.size()-1);
        }
        System.out.println(list);
    }

    public static void main(String[] args) {

        int [] arr ={1 ,2 ,3 ,4 ,5, 6, 7} ;
        rotate(arr,3);

//         for(int i : arr) {
//             System.out.print(" ," + i);
//         }


    }
}
