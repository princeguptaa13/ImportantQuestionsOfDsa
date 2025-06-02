package com.prince.Collectionframework.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class RemoveStack {
    static void poppingOut(Stack<Integer> st,Stack<Integer> rt , int n ){
        if (n < 0 || n > st.size()) {
            System.out.println("Invalid index.");
            return;
        }
        while(st.size()>n){
            rt.push(st.pop());
        }
        st.pop();
        while(rt.size()>0){
            st.push(rt.pop());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your no. to be pop out = ");
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        Stack<Integer> rt = new Stack<>();
        st.push(25);
        st.push(12);
        st.push(67);
        st.push(23);
        st.push(13);
        System.out.println("Original one = "+st);
        poppingOut(st,rt,n);
        System.out.println("New One = "+st);
    }
}
