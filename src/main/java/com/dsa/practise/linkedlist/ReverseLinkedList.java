package com.dsa.practise.linkedlist;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode();
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(5);
        ListNode e = new ListNode(6);
        ListNode f = new ListNode(7);
        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        printList("", head);
        head = reverseList(head);
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

    public static ListNode reverseList(ListNode head) {
        ListNode b = head;
        ListNode t = head;
        if (head == null || head.next == null) return head;
        while (b.next != null) {
            t = head;
            head = b.next;
            b.next = b.next.next;
            head.next = t;
        }
        return head;
    }
}