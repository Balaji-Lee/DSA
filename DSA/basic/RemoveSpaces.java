/**
 * Remove all spaces from a string.
 *
 * Rules:
 * - Remove only space characters (' ')
 * - Do NOT use built-in replace() or regex
 * - Do NOT use extra libraries
 *
 * Edge Cases:
 * - null → return null
 * - empty string → return empty string
 * - string with no spaces → return original string
 *
 * Examples:
 * Input: "Java World"
 * Output: "JavaWorld"
 *
 * Input: "  Hello  Java  "
 * Output: "HelloJava"
 */

public class RemoveSpaces {

    public static void main(String[] args) {

        String input = "Java World";
        System.out.println("Result: " + removeSpaces(input));
    }

    public static String removeSpaces(String input) {

        if(input == null || input.isEmpty()){
            return null;
        }

        char[] charArray = input.toCharArray();
        char[] result  = new char[input.length()];

        int point =0;
        for( char c :  charArray){
            if (c != ' ') {
               result[point] = c;
               point ++;
            }
        }
        return new String(result, 0, point);

    }
}
