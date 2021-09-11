package com.dsa.practise.linkedlist;

public class MyLinkedList {

    Node head;

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {
    }

    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList();
//        obj.addAtHead(1);
//        obj.printList();
//        obj.addAtTail(51);
//        obj.printList();
//        obj.addAtIndex(1, 6);
//        obj.printList();
//        obj.deleteAtIndex(1);
//        obj.printList();

//        obj.addAtHead(1);
//        obj.printList();
//        obj.addAtTail(3);
//        obj.printList();
//        obj.addAtIndex(1, 2);
//        obj.printList();
//        System.out.println("\n 0th :" + obj.get(0));
//        obj.deleteAtIndex(0);
//        obj.printList();
//        System.out.println("\n 0th :" + obj.get(0));

//        obj.addAtIndex(0, 10);
//        obj.printList();
//        obj.addAtIndex(0, 20);
//        obj.printList();
//        obj.addAtIndex(1, 30);
//        obj.printList();
//        System.out.println("\n 0th - "+obj.get(0));

        obj.addAtHead(84);
        obj.printList("addAtHead(84)");
        obj.addAtTail(2);
        obj.printList("addAtTail(2)");
        obj.addAtTail(39);
        obj.printList("addAtTail(39)");
        System.out.println("Index 3 :" + obj.get(3));
        System.out.println("index 1 :" + obj.get(1));
        obj.addAtTail(42);
        obj.printList("addAtTail(42)");
        obj.addAtIndex(1, 80);
        obj.printList("addAtIndex(1, 80)");
        obj.addAtHead(14);
        obj.printList("addAtHead(14)");
        obj.addAtHead(1);
        obj.printList("addAtHead(1)");
        obj.addAtTail(53);
        obj.printList("addAtTail(53)");
        obj.addAtTail(98);
        obj.printList("addAtTail(98)");
        obj.addAtTail(19);
        obj.printList("addAtTail(19)");
        obj.addAtTail(12);
        obj.printList("addAtTail(12)");
        System.out.println("index 2 :" + obj.get(2));
        obj.addAtHead(16);
        obj.printList("addAtHead(16)");
        obj.addAtHead(33);
        obj.printList("addAtHead(33)");
        obj.addAtIndex(4, 17);
        obj.printList("addAtIndex(4, 17)");
        obj.addAtIndex(6, 8);
        obj.printList("addAtIndex(6, 8)");
        obj.addAtHead(37);
        obj.printList("addAtHead(37)");
        obj.addAtTail(43);
        obj.printList("addAtTail(43)");
        obj.deleteAtIndex(11);
        obj.printList("deleteAtIndex(11)");
        obj.addAtHead(80);
        obj.printList("addAtHead(80)");
        obj.addAtHead(31);
        obj.printList("addAtHead(31)");
        obj.addAtIndex(13, 23);
        obj.printList("addAtIndex(13, 23)");
        obj.addAtTail(17);
        obj.printList("addAtTail(17)");
        System.out.println("index 4 :" + obj.get(4));
        obj.addAtIndex(10, 0);
        obj.printList("addAtIndex(10, 0)");
        obj.addAtTail(21);
        obj.printList("addAtTail(21)");
        obj.addAtHead(73);
        obj.printList("addAtHead(73)");
        obj.addAtHead(22);
        obj.printList("addAtHead(22)");
        obj.addAtIndex(24, 37);
        obj.printList("addAtIndex(24, 37)");
        obj.addAtTail(14);
        obj.printList("addAtTail(14)");
        obj.addAtHead(97);
        obj.printList("addAtHead(97)");
        obj.addAtHead(8);
        obj.printList("addAtHead(8)");
        System.out.println("index 6 :" + obj.get(6));
        obj.deleteAtIndex(17);
        obj.printList("deleteAtIndex(17)");
        obj.addAtTail(50);
        obj.printList("addAtTail(50)");
        obj.addAtTail(28);
        obj.printList("addAtTail(28)");
        obj.addAtHead(76);
        obj.printList("addAtHead(76)");
        obj.addAtTail(79);
        obj.printList("addAtTail(79)");
        System.out.println("index 18 :" + obj.get(18));
        obj.deleteAtIndex(30);
        obj.printList("deleteAtIndex(30)");
        obj.addAtTail(5);
        obj.printList("addAtTail(5)");
        obj.addAtHead(9);
        obj.printList("addAtHead(9)");
        obj.addAtTail(83);
        obj.printList("addAtTail(83)");
        obj.deleteAtIndex(3);
        obj.printList("deleteAtIndex(3)");
        obj.addAtTail(40);
        obj.printList("addAtTail(40)");
        obj.deleteAtIndex(26);
        obj.printList("deleteAtIndex(26)");
        obj.addAtIndex(20, 90);
        obj.printList("addAtIndex(20, 90)");
        obj.deleteAtIndex(30);
        obj.printList("deleteAtIndex(30)");
        obj.addAtTail(40);
        obj.printList("addAtTail(40)");
        obj.addAtHead(56);
        obj.printList("addAtHead(56)");
        obj.addAtIndex(15, 23);
        obj.printList("addAtIndex(15, 23)");
        obj.addAtHead(51);
        obj.printList("addAtHead(51)");
        obj.addAtHead(21);
        obj.printList("addAtHead(21)");
        System.out.println("index 26 :" + obj.get(26));
        obj.addAtHead(83);
        obj.printList("addAtHead(83)");
        System.out.println("index 30 :" + obj.get(30));
        obj.addAtHead(12);
        obj.printList("addAtHead(12)");
        obj.deleteAtIndex(8);
        obj.printList("deleteAtIndex(8)");
        System.out.println("index 4 :" + obj.get(4));
        obj.addAtHead(20);
        obj.printList("addAtHead(20)");
        obj.addAtTail(45);
        obj.printList("addAtTail(45)");
        System.out.println("index 10 :" + obj.get(10));
        obj.addAtHead(56);
        obj.printList("addAtHead(56)");
        System.out.println("index 18 :" + obj.get(18));
        obj.addAtTail(33);
        obj.printList("addAtTail(33)");
        System.out.println("index 2 :" + obj.get(2));
        obj.addAtTail(70);
        obj.printList("addAtTail(70)");
        obj.addAtHead(57);
        obj.printList("addAtHead(57)");
        obj.addAtIndex(31, 24);
        obj.printList("addAtIndex(31, 24)");
        obj.addAtIndex(16, 92);
        obj.printList("addAtIndex(16, 92)");
        obj.addAtHead(40);
        obj.printList("addAtHead(40)");
        obj.addAtHead(23);
        obj.printList("addAtHead(23)");
        obj.deleteAtIndex(26);
        obj.printList("deleteAtIndex(26)");
        System.out.println("index 1 :" + obj.get(1));
        obj.addAtHead(92);
        obj.printList("addAtHead(92)");
        obj.addAtIndex(3, 78);
        obj.printList("addAtIndex(3, 78)");
        obj.addAtTail(42);
        obj.printList("addAtTail(42)");
        System.out.println("index 18 :" + obj.get(18));
        obj.addAtIndex(39, 9);
        obj.printList("addAtIndex(39, 9)");
        System.out.println("index 13 :" + obj.get(13));
        obj.addAtIndex(33, 17);
        obj.printList("addAtIndex(33, 17)");
        System.out.println("index 51 :" + obj.get(51));
        obj.addAtIndex(18, 95);
        obj.printList("addAtIndex(18, 95)");
        obj.addAtIndex(18, 33);
        obj.printList("addAtIndex(18, 33)");
        obj.addAtHead(80);
        obj.printList("addAtHead(80)");
        obj.addAtHead(21);
        obj.printList("addAtHead(21)");
        obj.addAtTail(7);
        obj.printList("addAtTail(7)");
        obj.addAtIndex(17, 46);
        obj.printList("addAtIndex(17, 46)");
        System.out.println("index 33 :" + obj.get(33));
        obj.addAtHead(60);
        obj.printList("addAtHead(60)");
        obj.addAtTail(26);
        obj.printList("addAtTail(26)");
        obj.addAtTail(4);
        obj.printList("addAtTail(4)");
        obj.addAtHead(9);
        obj.printList("addAtHead(9)");
        System.out.println("index 45 :" + obj.get(45));
        obj.addAtTail(38);
        obj.printList("addAtTail(38)");
        obj.addAtHead(95);
        obj.printList("addAtHead(95)");
        obj.addAtTail(78);
        obj.printList("addAtTail(78)");
        System.out.println("index 54 :" + obj.get(54));
        obj.addAtIndex(42, 86);
        obj.printList("addAtIndex(42, 86)");
    }

    public void printList(String s) {
        Node current = this.head;
        System.out.println(s);
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println("\n");
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        Node current = this.head;
        int cnt = 0;
        while (current != null) {
            if (cnt == index) {
                return current.val;
            } else {
                cnt++;
                current = current.next;
            }
        }
        return -1;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        Node h = new Node(val);
        h.next = this.head;
        this.head = h;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        Node t = new Node(val);
        Node current = this.head;
        if (current != null) {
            while (current.next != null) {
                current = current.next;
            }
            current.next = t;
        } else {
            this.head = t;
        }
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }
        Node t = new Node(val);
        Node current = this.head;
        int cnt = 0;
        while (current != null) {
            if (cnt == index - 1) {
                t.next = current.next;
                current.next = t;
                break;
            } else {
                cnt++;
                current = current.next;
            }
        }
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        Node current = this.head;
        int cnt = 0;
        Node cPlusOne = null;
        Node cMinusOne = null;
        while (current != null) {
            if (index != 0 && cnt == index - 1) {
                cMinusOne = current;
            } else if (cnt == index + 1) {
                cPlusOne = current;
                break;
            }
            cnt++;
            current = current.next;
        }
        if (index == 0) {
            this.head = cPlusOne;
        } else if (cPlusOne != null && cMinusOne != null) {
            cMinusOne.next = cPlusOne;
        } else if(cMinusOne != null && cPlusOne == null){
            cMinusOne.next = null;
        }
    }

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
}

/*
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
