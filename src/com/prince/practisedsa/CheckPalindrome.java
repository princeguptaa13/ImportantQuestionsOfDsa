package com.prince.practisedsa;

import java.util.Scanner;

public class CheckPalindrome {

    static boolean checkingPalindrome(int x) {
        int reverse = 0;
        int dup = x ;
        while (x > 0) {
            int modulo = x % 10;
            reverse = (reverse * 10) + modulo;
            x = x / 10;
        }
        if (dup == reverse){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x = ");
        int x = sc.nextInt();


        System.out.println(checkingPalindrome(x));
    }
}
