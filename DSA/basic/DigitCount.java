/**
 * Count number of digits in an integer.
 *
 * Rules:
 * - 0 has 1 digit
 * - Ignore negative sign
 * - No String conversion
 *
 * Example:
 * Input: 1234 → Output: 4
 */

public class DigitCount {

    public static void main(String[] args) {

        int input = -123;
        System.out.println( input + " is contains " + getCountOfGivenNumber(input) );    
    }

    public static int getCountOfGivenNumber(int input){

        input = Math.abs(input);

        if(input == 0){
            return 1;
        }
        
        int result = 0;
        while(input != 0){
            int remainder = input / 10;
            result++;
            input = remainder;
        }
        return result;
    }
}
