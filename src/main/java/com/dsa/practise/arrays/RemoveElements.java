package com.dsa.practise.arrays;

public class RemoveElements {

    public int removeElement(int[] arr, int val) {
        int l = arr.length;
        for (int k = arr.length - 1; k >= 0; k--) {
            if (arr[k] == val) {
                lShift(arr, k);
                printArr(arr);
                l--;
            }
        }
        System.out.println("Final Array :");
        printArr(arr);
        System.out.println("----");
        return l;
    }

    public void lShift(int[] arr, int indexAt) {
        for (int i = indexAt; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }

    public void printArr(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = new int[]{-1, 0, 0, 0, 3, 0, 0, 1, 0, 0, 0};

        RemoveElements m = new RemoveElements();
        System.out.println("--------");
        m.printArr(arr);
        System.out.println("--------");

        System.out.println(m.removeElement(arr, 0));

    }
}
