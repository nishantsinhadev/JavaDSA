package com.dsa.practise.arrays;

public class ValidMountainArray {

    /**
     * this method evaluates whether the given input array is a valid mountain array or not.
     * the below condition are checked:
     * a. arr.length >= 3
     * b. the slope can only change from going upwards and then downwards
     *
     * @param arr
     * @return
     */
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;
        int direction = 0;// 0 : neutral, 1 : going up, 2 : going down
        int i = 0, j = i + 1;
        boolean result = false;
        while (i < j && j < arr.length) {
            int change = arr[j] - arr[i];
            System.out.println("i=" + i + ",j=" + j + ", i - j = " + change + ", currect direction =" + direction);
            if (change == 0) {
                // this means change has become constant while
                // the direction was going up or down previously
                // which is not possible
                return false;
            } else if (direction == 2 && change > 0) {
                // this means that while the direction was going down previously,
                // the change is now going up
                // which is not possible for a valid mountain array
                return false;
            } else if (direction == 0 && change < 0) {
                // this means that while the direction was previously neutral,
                // the change is now going downwards
                // which is also not possible for a valid mountain
                return false;
            }

            if (change > 0)
                direction = 1;
            else if (change < 0)
                direction = 2;
            else
                direction = 0;
            i++;
            j++;
            if (j == arr.length && direction == 2) {
                result = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int[] arr = new int[]{1,3,2};
        int[] arr = new int[]{1, 1, 1, 1, 1, 1, 1, 2, 1};
        ValidMountainArray v = new ValidMountainArray();
        System.out.println(v.validMountainArray(arr));
    }
}
