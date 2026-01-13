/**
 * Check whether a number is an Armstrong number.
 *
 * An Armstrong number is a number that is equal to the sum of its own digits
 * each raised to the power of the number of digits.
 *
 * Rules:
 * - Ignore negative sign (negative numbers are NOT Armstrong)
 * - Do NOT convert number to String
 *
 * Example:
 * Input: 153
 * Explanation:
 * Number of digits = 3
 * 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
 * Output: Armstrong
 *
 * Input: 123
 * Output: Not Armstrong
 */

public class ArmstrongNumber {

    public static void main(String[] args) {

        int input = 153;
        System.out.println(input + " is " + checkArmstrong(input));
    }

    public static String checkArmstrong(int input) {
        int numberOfDigits = 0;
        int resultVale = 0;
        int val = input;
        int temp = input;


        if(input <=0 ){
            return "Not Armstrong";
        }

        while(val != 0){
            val = val / 10;
            numberOfDigits++;
        }

            while(temp != 0) {
                int remain = temp % 10;
                resultVale +=  Math.pow(remain ,numberOfDigits );
                temp = temp / 10;
            }



        System.out.println("The Sum Value " +resultVale );
        if(resultVale == input){
            return "Armstrong";
        }else{
            return "Not Armstrong";
        }

    }
}
