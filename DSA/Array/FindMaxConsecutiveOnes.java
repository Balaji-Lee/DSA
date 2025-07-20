package DSA.array;

public class FindMaxConsecutiveOnes {

    // LEEDCODE https://leetcode.com/problems/max-consecutive-ones/description/

    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1, 1, 1 };
        int result = findMaxConsecutiveOnes(nums);
        System.err.println("Result :" + result);

    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int maxCountCurrent = 0;
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                maxCountCurrent++;
                result = Math.max(maxCountCurrent, result);
            } else {
                maxCountCurrent = 0;
            }
        }

        return result;

    }
}