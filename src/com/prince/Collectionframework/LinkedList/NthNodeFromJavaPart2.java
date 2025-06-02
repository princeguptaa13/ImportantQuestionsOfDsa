package com.prince.Collectionframework.LinkedList;

//This time , we found it in a single traversal
import java.util.Scanner;

public class NthNodeFromJavaPart2 {
    static class Node{
        int data ;
        Node next ;

        public Node(int data) {
            this.data = data;
        }
    }

    static int NthNodeFromEnd(Node head ,int n){
        Node fast = head;
        Node slow = head;
        for(int i=1 ; i<=n ; i++){
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data ;
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

        try{
          int result = NthNodeFromEnd(a , n );
            System.out.println(" "+result);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}