package com.prince.learningdsa.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {0, 1, 5, 3, 8, 2, 4};
        int n = arr.length;

        //int max = arr[0];
        // Initialize max with the first element
         int max = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) { // Start loop from 1
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger element is found
            }
        }
        System.out.println("The largest element is: " + max);
    }
}
