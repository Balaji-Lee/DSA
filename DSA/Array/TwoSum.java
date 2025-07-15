public class TwoSum {
    /*
     * Given an array of integers nums and an integer target, return indices of the
     * two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may
     * not use the same element twice.
     * You can return the answer in any order.
     *
     * Example:
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: nums[0] + nums[1] == 9, so we return [0, 1].
     */

    public static void main(String[] arg) {

        int[] nums = new int[] { 2, 7, 11, 5 };
        int k = 9;
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j =i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == k) {
                    result[0] = nums[i];
                    result[1] = nums[j];
                    break;
                }
            }
        }
        for(int l: result){
            System.out.print(l+"+");
        }

    }

}
