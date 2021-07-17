package com.dsa.practise.arrays;

import java.util.Arrays;

public class MoveAllZeroesToEnd {

    /**
     * This method moves all zeroes in the array to the end.
     * <p>
     * The program consists of a write index. Write index denotes the position to write a non zero number
     * <p>
     * The program iterates the given array and writes the number at current index
     * to the position at write index if the number at the current index is a non-zero number.
     * In the end after completion of the first iteration,
     * the program writes zero on all the remaining indexes in the array.
     *
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        int writeIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[writeIndex] = nums[i];
                writeIndex++;
            }
        }
        for (int k = writeIndex; k < nums.length; k++) {
            nums[k] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 0, 3, 12};
        MoveAllZeroesToEnd m = new MoveAllZeroesToEnd();
        m.moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

}