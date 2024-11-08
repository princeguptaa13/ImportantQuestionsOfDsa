package com.prince.learningdsa.Arrays;

public class RemoveDuplicatesFromSortedArray {
    static int removeDuplicates(int [] arr , int n ){
        int i = 0 ;
            for (int j = i+1 ; j<n-1 ; j++){
                if (arr[i] != arr[j]){
                    arr[i+1] = arr[j] ;
                    i++ ;
                }
            }return 1+i ;
    }
    public static void main(String[] args) {
        int [] arr = {4 , 5, 5, 2 , 2 , 2 , 9 } ;
        int n = arr.length ;
//        HashSet<Integer> elements = new HashSet<>();
//        for(int i=0;i<n;i++){
//            elements.add(arr[i]);
//        }
//        System.out.println(elements);
        int sys = removeDuplicates(arr , n );
        System.out.println(" "+sys);
    }
}
