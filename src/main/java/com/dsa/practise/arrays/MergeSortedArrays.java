package com.dsa.practise.arrays;

public class MergeSortedArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                nums3[k++] = nums1[i++];
            } else {
                nums3[k++] = nums2[j++];
            }
        }
        while (i < m) {
            nums3[k++] = nums1[i++];
        }

        while (j < n) {
            nums3[k++] = nums2[j++];
        }

        for (int x = 0; x < nums3.length; x++) {
            nums1[x] = nums3[x];
        }
        printArr(nums3);
    }

    public void printArr(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] nums1 = new int[]{-1, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0};
        int[] nums2 = new int[]{-1, -1, 0, 0, 1, 2};

        MergeSortedArrays m = new MergeSortedArrays();
        System.out.println("--------");
        m.printArr(nums1);
        m.printArr(nums2);
        System.out.println("--------");

        m.merge(nums1, 5, nums2, 6);

    }
}
