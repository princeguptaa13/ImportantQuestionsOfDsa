package com.prince.Collectionframework.Stacks;

import java.util.Scanner;
import java.util.Stack;

// we will push the element at bottom through recursion
public class PushAtBottom {
    static void pushAtBottomRec(Stack<Integer> st,int n){
        //base case
        if(st.size() == 0) {
            st.push(n);
            return ;
        }
        int top = st.pop();
        pushAtBottomRec(st , n);
        st.push(top);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        st.push(25);
        st.push(12);
        st.push(67);
        st.push(23);
        st.push(13);
        System.out.println(st + " ");
        System.out.println("Enter element to push at bottom = ");
        int n = sc.nextInt();
        pushAtBottomRec(st , n);
        System.out.println(st+ "  ");
    }
}
