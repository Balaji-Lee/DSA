package DSA.array;

import java.util.Arrays;

public class SortArrayByParity905 {

    // LEEDCODE https://leetcode.com/problems/sort-array-by-parity/

    public static void main(String[] args) {
        int[] input = new int[] { 0, 1, 2 };
        System.out.println(Arrays.toString(sortArrayByParity(input)));
    }

    public static int[] sortArrayByParity(int[] nums) {

        if (nums.length == 0) {
            return nums;
        }

        int pos1 = 0;
        int pos2 = nums.length - 1;
        while (pos1 < pos2) {
            if (nums[pos1] % 2 == 0) {
                pos1++;
            } else if (nums[pos2] % 2 != 0) {
                pos2--;

            } else {
                nums[pos1] = nums[pos1] ^ nums[pos2];
                nums[pos2] = nums[pos1] ^ nums[pos2];
                nums[pos1] = nums[pos1] ^ nums[pos2];
                pos1++;
                pos2--;
            }

        }
        return nums;
    }

}
