public class MoveZeroes {

    // LEEDCODE https://leetcode.com/problems/move-zeroes/

    public static void main(String[] arg) {

        int[] nums = { 1, 2, 3, 0, 0, 8 };
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {

        int pos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pos] = nums[i];
                pos++;
            }
        }

        while (pos < nums.length) {
            nums[pos] = 0;
            pos++;
        }
       
    }

}
