package com.masum.dsa.practice.dsa;

import java.util.Stack;

/**
 *
 * @author Masum
 */
public class CircularLinkList {

    static Node first;
    static Node last;

    public void insertLast(int x) {
        Node t = new Node();
        t.data = x;
        t.next = null;

        if (first == null) {
            first = t;
            last = t;
        } else {
            last.next = t;
            last = t;
        }

    }

    public static void main(String[] args) {
        Node head = new Node();
        head.data = 1;
        Node node2 = new Node();
        node2.data = 2;
        head.next = node2;

        Node node3 = new Node();
        node3.data = 3;
        node2.next = node3;
        node3.next = node2;

        Node p = head;

        int pos = 1;

        for (int i = 0; i < pos; i++) {
            p = p.next;
            head = p;
        }

        do {
            
            if (p != null)
            {
                System.out.println(p.data);
                p = p.next;
            }
            if (p == head) {
                System.out.println("True");
            }
        } while (p != head);
    }

}
