//package com.prince.Collectionframework.Stacks;
//
////here in this class , we start implementing stacks by using
//// linked list data structure
//public class ImplementationThroughLinkedList {
//    public static class Node{
//        int data ;
//        Node next ;
//        Node(int data ){
//            this.data= data;
//        }
//    }
//    public static class Stack{
//        Node head = null ;
//        int size = 0 ;
//        void push(int x){
//          Node temp = new Node(x);
//          temp.next = head ;
//          head = temp;
//          size ++ ;
//        }
//        void pop(int x){
//            Node temp = new Node(x);
//            temp.next.next = head;
//
//            size -- ;
//        }
//        void display(){
//            while(head!=null){
//                Node temp = head ;
//                System.out.println(" " +head.data);
//                temp ++ ;
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Stack st = new Stack();
//        st.push(13);
//        st.push(17);
//        st.push(21);
//        st.push(73);
//        st.display();
//        st.pop(17);
//        st.display();
//        System.out.println(st.size());
//    }
//}
