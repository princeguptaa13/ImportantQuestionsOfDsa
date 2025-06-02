package com.prince.Collectionframework.LinkedList;

import java.util.Scanner;

public class RemovingNthNodeFromJava {
    static void display(Node a){
        int size = 0 ;
        Node temp = a;
        while(temp != null){
            size ++ ;
            System.out.print(" "+temp.data);
            temp = temp.next;
        }
    }
    static class Node{
        int data ;
        Node next ;

        public Node(int data) {
            this.data = data;
        }
    }
    static Node removingNodeFromEnd(Node head, int n ){
     Node slow = head ;
     Node fast = head ;
     for(int i=1 ; i<=n ; i++){
         fast = fast.next ;
     }
     if(fast == null){
         head = head.next ;
         return head ;
     }
     while(fast.next != null){
             slow = slow.next ;
             fast = fast.next ;
         }
        slow.next = slow.next.next;
     return head ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

        System.out.print(" Enter value from last to be removed = ");
        int n = sc.nextInt();
         display(a);
         System.out.println();
         a = removingNodeFromEnd(a , n);
         display(a);
    }
}
