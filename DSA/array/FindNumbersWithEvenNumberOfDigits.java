package DSA.array;

public class FindNumbersWithEvenNumberOfDigits {

    // LEEDCODE https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

     public static void main(String[] args) {
        int[] nums = { 555,901,482,1771,1771 };
        int result = findNumbers(nums);
        System.err.println("Result :" + result);

    }

     public static int findNumbers(int[] nums) {
        int result = 0;
        for(int n : nums){
            int length = String.valueOf(n).length(); 
            if(length%2 == 0){
                result ++;
            }
        }
        return result;
    }
    
}
