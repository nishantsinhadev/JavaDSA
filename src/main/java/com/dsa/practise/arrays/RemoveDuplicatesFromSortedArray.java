package com.dsa.practise.arrays;

public class RemoveDuplicatesFromSortedArray {

    /**
     * this method will take a sorted array in the input and will place all unique elements in the
     * first k positions and will return the value of k in return.
     *
     * @param nums - sorted array input param
     * @return value denotes no. of first k elements in the input array with unique values
     */
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;

        // pointer i denotes position of the last unique no. in the list
        // pointer j denotes current position
        int i = 0, j = 0;
        System.out.print("i = " + i + ", j = " + j + "\n");

        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                // increment i to next position
                // swap no at j to ith index
                // increment j
                nums[++i] = nums[j];
            }
            j++;
        }
        printArr(nums);
        return i + 1;
    }

    public void printArr(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray r = new RemoveDuplicatesFromSortedArray();
//        int[] arr = new int[]{-1, 0, 0, 0, 1, 2, 2, 5, 5, 6, 6};
//        int[] arr = new int[]{1, 1, 2};
//        int[] arr = new int[]{};
        int[] arr = new int[]{-1, -1, 0, 0, 1, 2};
        System.out.println(r.removeDuplicates(arr));
    }
}
