package com.masum.dsa.practice.dsa;

/**
 *
 * @author Masum
 */
public class InsertNodeInLinkedList {
    static Node first;
    static Node last;
    public void insertLast(int x){
        Node t = new Node();
        t.data = x;
        t.next = null;
        
        if(first == null){
           first = t;
           last = t;
        } else {
            last.next = t;
            last = t;
        }
        
    }
    public static void main(String[] args) {
        InsertNodeInLinkedList in = new InsertNodeInLinkedList();
        in.insertLast(1);
        in.insertLast(2);
        in.insertLast(1);
        Node x = first;
        //
        while(first != null){
            System.out.println("" + first.data);
            first = first.next;
        }
        
        while(x != null){
            System.out.println("" + x.data);
            x = x.next;
        }
    }

}
