package com.prince.practisedsa;
import java.util.Scanner;

public class SubArraySumFinder {
    static int subArray(int[] arr , int n , int k ){
        int count = 0 ;
        int Q = 0 ;
        int P = 1 ;
        int sum = arr[Q]+arr[P];
        for(int i = P ; i < n ; i++){
            if(sum == k ){
                count++;
            }
                if(sum < k){
                    P++ ;
                    sum += arr[P];
                }else if(sum > k) {
                    sum -= arr[Q];
                    Q++ ;
            }
        }
        return count ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of k = ");
        int k = sc.nextInt();

        int [] arr = {1,1,5,2,31,1,1,1,1,2,1,2,3,2};
        int n = arr.length ;

        int result = subArray(arr , n , k );
        System.out.println(" " +result);
//        for(int val : arr){
//            System.out.print(" " +val);
//        };
        sc.close();

    }
}
