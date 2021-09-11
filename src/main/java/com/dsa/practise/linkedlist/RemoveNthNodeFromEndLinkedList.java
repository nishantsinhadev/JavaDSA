package com.dsa.practise.linkedlist;

public class RemoveNthNodeFromEndLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
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
        head = removeNthFromEnd(head, 2);
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

//    public static ListNode removeNthFromEnd(ListNode head, int n) {
//
//        ListNode a = head;
//        ListNode b = head;
//        if (b.next == null && n > 1) {
//            return head;
//        } else if (b.next == null && n==1){
//            head = null;
//            return head;
//        }
//        for (int i = 0; i < n; i++) {
//            if(b.next == null)
//                break;
//            b = b.next;
//
//        }
//        //System.out.println("b : " + b.val);
//        while (b.next != null) {
//            a = a.next;
//            b = b.next;
//        }
//
//        ListNode c = a.next.next;
//        if (c!=null) {
//            a.next = c;
//        } else if(a.next == b && n==1){
//            a.next = c;
//        } else if(a.next == b && n > 1){
//            head = b;
//        }
//        return head;
//    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode a = head;
        ListNode b = head;
        ListNode c = head;
        int l = 1;
        while (b.next != null) {
            b = b.next;
            l++;
        }
        System.out.println("b : " + b.val);
        System.out.println("length : " + l);

        for (int i = 0; i < l - n; i++) {
            c = c.next;
        }

        if(l - n > 0){
            while(a.next != c){
                a = a.next;
            }
            a.next = c.next;
        } else if (l - n == 0){
            head = a.next;
        }
        return head;
    }

}