package com.prince.learningdsa.sorting;

public class SelectionSorting2 {
    static void selectionSortSecQuestion(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i+1; j < n ; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
                    int temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        int n = arr.length;
        selectionSortSecQuestion(arr, n);

        for (int i : arr) {
            System.out.print(" " + i);
        }
    }
}
