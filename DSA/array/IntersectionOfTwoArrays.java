package DSA.array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays {

    // LEEDCODE
    // https://leetcode.com/problems/intersection-of-two-arrays/description/

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 3, 4, 7 };
        int[] nums2 = { 0, 2, 2, 3, 7 };
        int[] result = intersection(nums1, nums2);
        System.out.println("RESULT : " + Arrays.toString(result));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if (!resultList.contains(nums1[i])) {
                        resultList.add(nums1[i]);
                    }
                }
            }

        }
        int[] resultArray = new int[resultList.size()];

        for (int x = 0; x < resultList.size(); x++) {
            resultArray[x] = resultList.get(x);
        }

        return resultArray;
    }

}
