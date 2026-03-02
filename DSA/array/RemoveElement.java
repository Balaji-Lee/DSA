package DSA.array;

public class RemoveElement {

    // LEEDCODE https://leetcode.com/problems/remove-element/description/

    public static void main(String[] args) {
        int[] input = new int[] { 2, 3, 3, 2, 4, 4, 3, 2, 1 };
        int k = 1;
        int result = removeElement(input, k);
        System.out.println("Result :" + result);
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }

        }

        return k;
    }

}
