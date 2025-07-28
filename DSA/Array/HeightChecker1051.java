package DSA.array;

import java.util.Arrays;

public class HeightChecker1051 {

    // LEEDCODE // https://leetcode.com/problems/height-checker/description/

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int result = heightChecker(nums);
        System.err.println("Result :" + result);

    }

    public static int heightChecker(int[] heights) {

        int count = 0;
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);
        
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }

        return count;

    }

}