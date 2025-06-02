package com.prince.Collectionframework.Stacks;
import java.util.Scanner;
import java.util.Stack;

public class InsertAtAnyIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your element No = ");
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        System.out.print("Enter your elements now = ");
        for(int i=0 ; i<n ; i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println("Real one = "+st);
        Stack<Integer> st2 = new Stack<>();
        while (!st.isEmpty()){
            st2.push(st.pop());
        }
        System.out.println("Copied one = "+st2);
        Stack<Integer> st3 = new Stack<>();
        while(!st2.isEmpty()){
            st3.push(st2.pop());
        }
        System.out.println("Third one = "+st3);
    }
}
