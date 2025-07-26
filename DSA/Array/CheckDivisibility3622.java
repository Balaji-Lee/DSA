package DSA.array;

public class CheckDivisibility3622 {

    // LEEDCODE
    // https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/

    public static void main(String[] args) {

        int input = 99;
        System.out.println("Result :" + checkDivisibility(input));
    }

    public static boolean checkDivisibility(int n) {

        String val = String.valueOf(n);

        if (val.length() < 2) {
            return false;
        }

        int[] valArr = new int[val.length()];

        for (int i = 0; i < valArr.length; i++) {
            valArr[i] = val.charAt(i) - '0';

        }

        int sum = valArr[0];
        int mul = valArr[0];

        for (int j = 1; j < valArr.length; j++) {
            sum = sum + valArr[j];
            mul = mul * valArr[j];
        }

        int total = sum + mul;

        return n % total == 0;

    }

}