package com.prince.Collectionframework.DoublyCircularLL;

public class InsertMethod {
    static class Node{
        int data ;
        Node next ;
        Node prev ;
        public Node(int data) {
            this.data = data;
        }
    }
    static void display(Node head){
        Node temp = head ;
        while(temp != null){
            System.out.print(" "+temp.data);
            temp = temp.next;
        }

    }
    public static void main(String[] args) {
        Node a = new Node(12);
        Node b = new Node(22);
        Node c = new Node(6);
        Node d = new Node(13);
        Node e = new Node(76);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = d;
        c.next = d;
        d.prev = e;
        d.next = e;
        e.next = null;

       display(a);





    }
}
