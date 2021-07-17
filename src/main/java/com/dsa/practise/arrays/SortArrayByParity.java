package com.dsa.practise.arrays;

import java.util.Arrays;

public class SortArrayByParity {

    /**
     * Sort array such that all even elements of the given array are followed by all odd elements.
     * <p>
     * The program iterates the array and swaps the element at current index
     * with the element at the write index if the element at the current index is an even number.
     *
     * @param num : Input array
     * @return : Sorted Array by parity
     */
    public int[] sortArrayByParity(int[] num) {
        int writeIndex = 0;
        int tmp;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                tmp = num[writeIndex];
                num[writeIndex++] = num[i];
                num[i] = tmp;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 2, 4};
        SortArrayByParity s = new SortArrayByParity();
        System.out.println(Arrays.toString(s.sortArrayByParity(arr)));
    }
}
