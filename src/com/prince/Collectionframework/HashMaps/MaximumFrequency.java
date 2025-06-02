package com.prince.Collectionframework.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class MaximumFrequency {

    public static void main(String[] args) {
        int [] arr = {1,3,2,1,4,1};
        Map<Integer,Integer> freq = new HashMap<>();

        for(int el : arr){
            if(!freq.containsKey(el)){
               freq.put(el ,1);
            }else{
               freq.put(el , freq.get(el)+1);
            }

        }
        System.out.println(freq.entrySet());
        int max = 0 ; int ansKey = -1 ;
        for(var e : freq.entrySet()){
            if(e.getValue() > max){
                max = e.getValue();
                ansKey = e.getKey();
            }
            System.out.print(ansKey);
        }
       }
    }

