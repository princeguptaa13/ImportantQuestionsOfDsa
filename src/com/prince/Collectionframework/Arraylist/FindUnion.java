package com.prince.Collectionframework.Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class FindUnion {
    public static void main(String[] args) {
        int[] arr1 = {1 , 2 , 3 , 4};
        int[] arr2 = {2 , 3 , 6 , 8 , 9};
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int element : arr1){
            arrayList.add(element);
        }
        for(int element : arr2){
            arrayList.add(element);
        }
        Collections.sort(arrayList);
        HashSet<Integer> set = new HashSet<>(arrayList);
        arrayList.clear();
        arrayList.addAll(set);
        System.out.println("Union : "+arrayList);
    }
}
