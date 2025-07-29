package DSA.array;

public class ThirdMaximumNumber414 {

    // LEEDCODE https://leetcode.com/problems/third-maximum-number/description/

    public static void main(String[] args) {

        int[] input = new int[] { 0, 0, 1, 9, 1, 1, 2, 2, 3, 3, 4 };

        int result = thirdMax(input);
        System.out.println("Result :" + result);
    }

    public static int thirdMax(int[] nums) {

        Long first = null, second = null, third = null;

        for (int n : nums) {
            long num = (long) n;
            if ((first != null && num == first) ||
                    (second != null && num == second) ||
                    (third != null && num == third)) {
                continue; // skip duplicates
            }

            if (first == null || num > first) {
                third = second;
                second = first;
                first = num;
            } else if (second == null || num > second) {
                third = second;
                second = num;
            } else if (third == null || num > third) {
                third = num;
            }
        }

        return third != null ? third.intValue() : first.intValue();

    }

}