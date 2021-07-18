package com.dsa.practise.arrays;

public class RemoveElementsInPlace {

    /**
     * This method removes all occurrences of "val" in the given input array.
     * <p>
     * Solved by using two pointers - write index and current index.
     * We are rewriting the array with only elements which do not match the input "val".
     * If the element matches "val", do not write it in array.
     * <p>
     * Write Index : position where you need to write.
     * Current Index : current position while iterating the given array
     *
     * @param arr
     * @param val
     * @return
     */
    public int removeElement(int[] arr, int val) {
        int writeIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[writeIndex++] = arr[i];
            }
        }
        return writeIndex;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        RemoveElementsInPlace s = new RemoveElementsInPlace();
        System.out.println(s.removeElement(arr, 2));
    }
}
