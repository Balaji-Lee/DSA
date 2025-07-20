package DSA.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindAllDuplicatesInAnArray {

    // LEEDCODE
    // https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1, 1, 11, 11, 100 };
        System.out.println("Input :" + Arrays.toString(nums));
        List<Integer> result = findDuplicates(nums);
        System.out.println("Output :" + result);
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();
        for (int n : nums) {
            if (seen.contains(n)) {
                if (!result.contains(n)) {
                    result.add(n);
                }
            }else{
                seen.add(n);
            }
        }
        return result;
    }
}
