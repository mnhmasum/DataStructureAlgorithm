package com.masum.dsa.practice.dsa;

/**
 *
 * @author Masum
 */
public class ReverseLinkListSlidinPointer {

    public static void main(String[] args) {
        Node node1 = new Node();
        node1.data = 1;
        Node node2 = new Node();
        node2.data = 2;
        node1.next = node2;

        Node node3 = new Node();
        node3.data = 3;
        node2.next = node3;

        Node p = null, q = null, r = null;

        r = node1;
        while (r != null) {
            p = q;
            q = r;
            r = r.next;
            q.next = p;
        }
        
        node1 = q;
        while (q != null) {
            System.out.println(q.data);
            q = q.next;
        }

    }
}
