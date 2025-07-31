package DSA.array;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedArray448 {

    // LEEDCODE https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

    public static void main(String[] args) {

        int[] arr = new int[] {4,3,2,7,8,2,3,1 };
        List<Integer> result = findDisappearedNumbers(arr);
        System.out.println("Result :" + result.toString());

    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<>();

          for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

          for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }

}