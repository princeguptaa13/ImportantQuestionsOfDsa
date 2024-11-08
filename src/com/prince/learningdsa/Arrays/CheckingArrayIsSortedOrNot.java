package com.prince.learningdsa.Arrays;

public class CheckingArrayIsSortedOrNot {
    static public boolean checkSubArraySorted(int[] num,int no) {
        //logic to check given array is sorted not.
        if (num[0] < num[no]) {
            for (int i = 0; i < no; i++) {
                boolean b = num[i] < num[i + 1];
                return true;
            }
        } else if (num[0] > num[no]) {
            for (int i = 0; i < no; i++) {
                boolean b = num[i] > num[i + 1];
                return true;
            }
        } else return false;
        return  false;
    }
            static boolean sortedArray(int[] arr){
                int n = arr.length ;
            for (int i = 0; i < n; i++) {
                if(arr[i] > arr[i+1]){
                    checkSubArraySorted(arr , n);
                }

            }
            return checkSubArraySorted(arr , n );
   }
       public static void main (String[]args){
           int[] arr = {5,4,3,2};

           System.out.println(sortedArray(arr));
           }
       }




