/**
 * Reverse a given string.
 *
 * Rules:
 * - Do NOT use built-in reverse methods (like StringBuilder.reverse())
 * - Do NOT use extra libraries
 * - You may use loops and character access
 *
 * Edge Cases:
 * - null string → return null
 * - empty string → return empty string
 *
 * Example:
 * Input: "hello"
 * Output: "olleh"
 *
 * Input: "Java"
 * Output: "avaJ"
 */

public class ReverseString {

    public static void main(String[] args) {

        String input = "hello";
        System.out.println("Reversed string: " + reverse(input));
    }

    public static String reverse(String input) {

        if(input == null)
            return null;

        if(input.isEmpty())
            return input;

        int start = 0;
        int end = input.length()-1;

        char[] myArray = input.toCharArray();
        while(start < end ){
            char temp =myArray[end];
            myArray[end] =  myArray[start];
            myArray[start] =  temp;
            start ++;
            end --;
        }

        return new String(myArray);

    }
}
