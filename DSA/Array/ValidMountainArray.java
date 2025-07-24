package DSA.array;

import java.util.Arrays;

public class ValidMountainArray {

    public static void main(String[] arg) {
        int[] input = new int[] { 0, 3, 2, 1 };
        System.out.println("INPUT :" + Arrays.toString(input));
        System.out.println("Is it valid Mountain :" + validMountainArray(input));
    }

    public static boolean validMountainArray(int[] arr) {

        int n = arr.length;
        if (n < 3)
            return false;

        int p = 0;

        // Walk up (increasing slope)
        while (p + 1 < n && arr[p] < arr[p + 1]) {
            p++;
        }

        // Peak can't be first or last
        if (p == 0 || p == n - 1)
            return false;

        // Walk down (decreasing slope)
        while (p + 1 < n && arr[p] > arr[p + 1]) {
            p++;
        }

        return n - 1 == p;

    }

}