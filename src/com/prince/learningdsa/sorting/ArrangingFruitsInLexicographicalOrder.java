package com.prince.learningdsa.sorting;

import java.util.Arrays;

public class ArrangingFruitsInLexicographicalOrder {
    static void sortFruits(String[] str){
        int n = str.length;
        for(int i=0 ;i<n ;i++){
            int min = i ;
            for(int j=i+1 ; j<n ; j++){
                if(str[j].compareTo(str[min])< 0) {
                    min = j ;
                }
            }
            //swap the strings
            String temp = str[i];
            str[i] = str[min] ;
            str[min] = temp ;

        }
    }
    public static void main(String[] args) {
        String[] str = {"papaya","watermelon","lime","apple","mango","kiwi"};

        sortFruits(str);
        for(String val : str){
            System.out.print(" "+val);
        }

    }
}
