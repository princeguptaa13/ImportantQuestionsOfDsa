package com.prince.Collectionframework.LinkedList;

import java.util.Scanner;

//you hava to find nth node from last of the linkedList
public class NthNodeFromJava {
//    static void display(Node a){
//        int size = 0 ;
//        Node temp = a;
//        while(temp != null){
//            size ++ ;
//            System.out.println(" "+temp.data);
//            temp = temp.next;
//
//        }
//        System.out.println("size = "+size );
//    }
    static int nthNodeFromLast(Node head , int n){
        int size = 0 ;
        Node temp = head;
        while(temp != null){
            size ++ ;
           // System.out.println(" "+temp.data);
            temp = temp.next;
        }
        int m = size - n + 1 ;
        temp = head;
        for(int i = 1 ; i < m ; i++){
            temp = temp.next;
        }
        return temp.data;
    }
    static class Node {
        int data ;
        Node next ;

        public Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        Node a = new Node(23); //head
        Node b = new Node(13);
        Node c = new Node(12);
        Node d = new Node(7);
        Node e = new Node(11);
        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = e ;
        e.next = null ;

        System.out.print("Enter the value of n from last = ");
        int n = sc.nextInt();
        //display(a);
        int val = nthNodeFromLast(a,n);
        System.out.print("Your number is =  "+val);
    }
}
