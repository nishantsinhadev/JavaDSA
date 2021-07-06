package com.dsa.practise.arrays;

public class CheckNAndItsDouble {

    public boolean checkIfExist(int[] arr) {
        if (arr.length == 0) return false;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == (2 * arr[j]) || (arr[i] * 2) == arr[j]) return true;
            }
        }
        return false;
    }

    public void printArr(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CheckNAndItsDouble r = new CheckNAndItsDouble();
//        int[] arr = new int[]{-1, 0, 0, 0, 1, 2, 2, 5, 5, 6, 6};
//        int[] arr = new int[]{1, 1, 2};
        int[] arr = new int[]{};
//        int[] arr = new int[]{-1, -1, 0, 0, 1, 2};
        System.out.println(r.checkIfExist(arr));
    }
}
