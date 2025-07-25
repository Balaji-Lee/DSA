package DSA.array;

import java.util.Arrays;

public class ReplaceElements1299 {

    // LEEDCODE
    // https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/description/

    public static void main(String[] args) {
        int[] input = new int[] { 17, 18, 5, 4, 6, 1 };
        System.out.println("INPUT :" + Arrays.toString(input));
        System.out.println("OUTPUT :" + Arrays.toString(replaceElements(input)));
    }

    public static int[] replaceElements(int[] arr) {

        int maxNumTracker = -1;

        for (int i = arr.length - 1; i >= 0; i--) {

            int currentElement = arr[i];
            arr[i] = maxNumTracker;

            if (maxNumTracker < currentElement) {
                maxNumTracker = currentElement;
            }

        }

        return arr;

    }

}
