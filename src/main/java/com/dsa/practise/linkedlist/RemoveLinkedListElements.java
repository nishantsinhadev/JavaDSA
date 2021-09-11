package com.dsa.practise.linkedlist;

public class RemoveLinkedListElements {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode a = new ListNode(2);
//        ListNode b = new ListNode(1);
//        ListNode c = new ListNode(1);
//        ListNode d = new ListNode(1);
//        ListNode e = new ListNode(1);
//        ListNode f = new ListNode(1);
        head.next = a;
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        e.next = f;
        printList("", head);
        head = removeElements(head, 1);
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

    public static ListNode removeElements(ListNode head, int val) {
        ListNode a = head;
        while (a != null && a.next != null) {
            ListNode t = a.next;
            if(t.val==val){
                a.next = t.next;
            } else {
                a = a.next;
            }
        }
        if(head !=null && head.val ==val)
            head=head.next;
        return head;
    }
}