package com.dsa.practise.arrays;

public class ReplaceElementWithGreatestOnRight {

    public int[] replaceElements(int[] arr) {
        int i = 0;
        int j = 1;
        int k = 0;
        int maxNo = -1;
        while (i < arr.length - 1) {
            if (i == arr.length - 2) {
                arr[i]=arr[i+1];
                break;
            }
            while (j < arr.length) {
                if (arr[j] > maxNo) {
                    maxNo = arr[j];
                    k = j;
                }
                j++;
            }
            overwriteElementsOnLeft(arr, i, k - 1, maxNo);
            i = k;
            j = k + 1;
            maxNo = -1;
        }
        arr[arr.length - 1] = -1;
        printArr(arr);
        return arr;
    }

    public void overwriteElementsOnLeft(int[] arr, int from, int to, int val) {
        for (int i = from; i <= to; i++) {
            arr[i] = val;
        }
    }

    public void printArr(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int[] arr = new int[]{1,3,2};
//        int[] arr = new int[]{1, 1, 1, 1, 1, 1, 1, 2, 1};
        int[] arr = new int[]{17, 18, 5, 4, 6, 1};
        ReplaceElementWithGreatestOnRight r = new ReplaceElementWithGreatestOnRight();
        System.out.println("--------");
        r.printArr(arr);
        System.out.println("--------");
        r.replaceElements(arr);
    }
}
