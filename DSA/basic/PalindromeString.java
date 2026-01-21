/**
 * Check whether a given string is a Palindrome.
 *
 * A palindrome string reads the same forward and backward.
 *
 * Rules:
 * - Case-sensitive (for now)
 * - Do NOT use built-in reverse methods
 * - Do NOT use extra libraries
 *
 * Edge Cases:
 * - null → return false
 * - empty string → return true
 *
 * Examples:
 * Input: "madam"
 * Output: true
 *
 * Input: "level"
 * Output: true
 *
 * Input: "Java"
 * Output: false
 */

public class PalindromeString {

    public static void main(String[] args) {

        String input = "madam";
        System.out.println(input + " is Palindrome: " + isPalindrome(input));
    }

    public static boolean isPalindrome(String input) {

        if(input == null )
          return false;

        if(input.isEmpty() )
          return true;

        int start =0;
        int end = input.length()-1;

        while(start < end){

           if( input.charAt(start) != input.charAt(end)){
               return false;
           }
            end--; start ++;
        }

        return true;

    }
}
