package com.prince.Collectionframework.LinkedList;

//learning how to implement Insert elements at beginning and
// insert elements at end in LinkedList.
public class LearningInsertMeth {
    public static class Node{

        int data ;
        Node next ;

        public Node(int data) {
            this.data = data;
        }
    }

    public static int length(Node head){
        Node temp = head;
        int count=0 ;
        while (temp != null) {
            count++ ;
            temp = temp.next;
        }
        return count;
    }
    public static class LinkedList{
        Node head = null ;
        Node tail = null ;
        void InsertAtbeginning(int val){

            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            } else {
                temp.next = head ;
                head = temp ;
            }
        }
        void insertAnywhere(int val, int idx){
            Node t = new Node(val);
            Node temp = head ;
            for(int i=0;i<idx-1;i++){
              temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
        void InsertAtEnd(int val){

            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            } else {
                tail.next = temp ;
                tail = temp ;
            }
        }
        void display(){
            Node temp = head ;
            while(temp != null){
                System.out.print(" "+temp.data);
                temp = temp.next ;
            }

        }
    }

    public static void main(String[] args) {
//        Node a = new Node(1);
//        Node b = new Node(2);
//        Node c = new Node(8);
//        Node d = new Node(6);
//
//        a.next = b ;
//        b.next = c ;
//        c.next = d ;
//        d.next = null ;

        LinkedList ll = new LinkedList();

        ll.InsertAtbeginning(9);
        ll.InsertAtbeginning(5);
        ll.InsertAtEnd(13);
        ll.InsertAtbeginning(2);
        ll.display();
        ll.insertAnywhere(34,2);
        ll.InsertAtbeginning(69);
        System.out.println();
        ll.display();
    }
}
