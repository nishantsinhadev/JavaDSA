package com.dsa.practise.queue;

import java.util.Arrays;

/**
 * Design your implementation of the circular queue.
 * The circular queue is a linear data structure in which the operations are performed based on FIFO (First In First Out) principle and
 * the last position is connected back to the first position to make a circle. It is also called "Ring Buffer".
 * <p>
 * One of the benefits of the circular queue is that we can make use of the spaces in front of the queue.
 * In a normal queue, once the queue becomes full, we cannot insert the next element even if there is a space in front of the queue.
 * But using the circular queue, we can use the space to store new values.
 * <p>
 * Implementation the MyCircularQueue class:
 * <p>
 * - MyCircularQueue(k) Initializes the object with the size of the queue to be k.
 * - int Front() Gets the front item from the queue. If the queue is empty, return -1.
 * - int Rear() Gets the last item from the queue. If the queue is empty, return -1.
 * - boolean enQueue(int value) Inserts an element into the circular queue. Return true if the operation is successful.
 * - boolean deQueue() Deletes an element from the circular queue. Return true if the operation is successful.
 * - boolean isEmpty() Checks whether the circular queue is empty or not.
 * - boolean isFull() Checks whether the circular queue is full or not.
 */
public class MyCircularQueue {

    int[] arr;
    int head;
    int tail;
    int size;

    public MyCircularQueue(int k) {
        arr = new int[k];
        Arrays.fill(arr, -1);
        head = 0;
        tail = 0;
        size = k;
    }

    public boolean enQueue(int value) {
        if (!isFull()) {
            arr[tail] = value;
            if ((tail + 1) < arr.length) {
                tail++;
            } else {
                tail = 0;
            }
            size--;
            return true;
        }
        return false;
    }

    public boolean deQueue() {
        if (size == arr.length)
            return false;

        arr[head] = -1;
        if ((head + 1) < arr.length) {
            head++;
        } else {
            head = 0;
        }
        size++;
        return true;
    }

    public int Front() {
        return arr[head];
    }

    public int Rear() {
        return (tail - 1) < 0 ? arr[arr.length - 1] : arr[tail - 1];
    }

    public boolean isEmpty() {
        return size == arr.length ? true : false;
    }

    public boolean isFull() {
        return size == 0 ? true : false;
    }

    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        System.out.println(myCircularQueue.enQueue(1)); // return True
        System.out.println(myCircularQueue.enQueue(2)); // return True
        System.out.println(myCircularQueue.enQueue(3)); // return True
        System.out.println(myCircularQueue.enQueue(4)); // return False
        System.out.println(myCircularQueue.Rear());     // return 3
        System.out.println(myCircularQueue.isFull());   // return True
        System.out.println(myCircularQueue.deQueue());  // return True
        System.out.println(myCircularQueue.enQueue(4)); // return True
        System.out.println(myCircularQueue.Rear());     // return 4

//        MyCircularQueue myCircularQueue = new MyCircularQueue(6);
//        System.out.println(myCircularQueue.enQueue(6));//true
//        System.out.println(myCircularQueue.Rear());//6
//        System.out.println(myCircularQueue.Rear());//6
//        System.out.println(myCircularQueue.deQueue());//true
//        System.out.println(myCircularQueue.enQueue(5));//true
//        System.out.println(myCircularQueue.Rear());//5
//        System.out.println(myCircularQueue.deQueue());//true
//        System.out.println(myCircularQueue.Front());//-1
//        System.out.println(myCircularQueue.deQueue());//false
//        System.out.println(myCircularQueue.deQueue());//false
//        System.out.println(myCircularQueue.deQueue());//false


//        MyCircularQueue myCircularQueue = new MyCircularQueue(8);
//        System.out.println(myCircularQueue.enQueue(3));//true
//        System.out.println(myCircularQueue.enQueue(9));//true
//        System.out.println(myCircularQueue.enQueue(5));//true
//        System.out.println(myCircularQueue.enQueue(0));//true
//        System.out.println(myCircularQueue.deQueue());//true
//        System.out.println(myCircularQueue.deQueue());//true
//        System.out.println(myCircularQueue.isEmpty());//false
//        System.out.println(myCircularQueue.isEmpty());//false
//        System.out.println(myCircularQueue.Rear());//0
//        System.out.println(myCircularQueue.Rear());//0
//        System.out.println(myCircularQueue.deQueue());//true
    }
}
