package com.prince.practisedsa;

public class RemovingOccurence {
    public static void main(String[] args) {

        String str1 = "abcaxxx";
        StringBuilder str = new StringBuilder(str1);
        int frequency=0;

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    if(i!=0){i--;}
                    // System.out.println("char "+str.charAt(i)+" Repeat ");
                    str.deleteCharAt(j);
                }
            }
        }
        System.out.println(str);
    }
}



