
package DSA.array;

import java.util.Arrays;

public class MergeSortedArray {

    // lEEDCODE https://leetcode.com/problems/merge-sorted-array/description/

    public static void main(String[] args) {

        int[] nums1 = { -1, 0, 0, 3, 3, 3, 0, 0, 0 };
        int[] nums2 = { 1, 2, 2 };
        int m = 6;
        int n = 3;

        System.out.println("Result :" + Arrays.toString(merge(nums1, m, nums2, n)));

    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m - 1;
        int p2 = n - 1;
        int k = m + n - 1;

        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[k--] = nums1[p1--];
            } else {
                nums1[k--] = nums2[p2--];
            }
        }
        return nums1;

    }

}
