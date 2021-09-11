package com.dsa.practise.linkedlist;

public class OddEvenLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(1);
        ListNode e = new ListNode(2);
        ListNode f = new ListNode(1);
        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        printList("", head);
        head = oddEvenList(head);
        printList("", head);
    }

    public static void printList(String s, ListNode head) {
        ListNode current = head;
        System.out.println(s);
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println("\n");
    }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null) return head;
        ListNode o = head;
        ListNode eh = head.next;
        ListNode e = head.next;
        while (e != null && e.next != null) {
            o.next = e.next;
            e.next = o.next.next;
            o = o.next;
            e = e.next;
        }
        o.next = eh;
        return head;
    }
}
