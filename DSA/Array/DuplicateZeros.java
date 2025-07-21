package DSA.array;

import java.util.Arrays;

public class DuplicateZeros {

    // LEEDCODE https://leetcode.com/problems/duplicate-zeros/description/

    public static void main(String[] args) {

        int[] arr = new int[] { 1, 0, 2, 3, 0, 4, 5, 0 };
        int[] result = duplicateZeros(arr);
        System.out.println("Result :" + Arrays.toString(result));

    }

    public static int[] duplicateZeros(int[] arr) {

        int zeroCount = 0;
        for (int n : arr) {
            if (n == 0) {
                zeroCount++;
            }
        }

        int i = arr.length - 1;
        int j = arr.length + zeroCount - 1;

        while (i != j) {
            insert(arr, i, j--);
            if (arr[i] == 0) {
                insert(arr, i, j--);
            }
            i--;

        }
        return arr;

    }

    public static void insert(int[] arr, int i, int j) {
        if (j < arr.length) {
            arr[j] = arr[i];
        }
    }

}
