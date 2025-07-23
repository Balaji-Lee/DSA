package DSA.array;

public class RemoveDuplicatesFromSortedArray {

    // LLEDCODE https://leetcode.com/problems/remove-duplicates-from-sorted-array/

    public static void main(String[] args) {
        int[] input = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        int result = removeDuplicates(input);
        System.out.println("Result :" + result);
    }

    public static int removeDuplicates(int[] nums) {

        int pointer = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[pointer] = nums[i];
                pointer++;
            }
        }
        return pointer;

    }

}
