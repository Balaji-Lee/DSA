package DSA.array;

import java.util.Arrays;

public class SquaresOfASortedArray {

    // LEEDCODE https://leetcode.com/problems/squares-of-a-sorted-array/description/

    public static void main(String[] args) {
        int[] input = new int[] { 4, -1, 0, 3, 10 };
        int[] result = sortedSquares(input);
        System.out.println("Result :" + Arrays.toString(result));
    }

    public static int[] sortedSquares(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                int temp = 0;
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }
}
