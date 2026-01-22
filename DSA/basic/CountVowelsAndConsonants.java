/**
 * Count vowels and consonants in a string.
 *
 * Rules:
 * - Consider only alphabetic characters
 * - Ignore spaces, digits, and special characters
 * - Vowels: a, e, i, o, u (both cases)
 *
 * Edge Cases:
 * - null → return 0, 0
 * - empty string → return 0, 0
 *
 * Example:
 * Input: "hello"
 * Output: Vowels = 2, Consonants = 3
 */

public class CountVowelsAndConsonants {

    public static void main(String[] args) {

        String input = "Java World";
        countVowelsAndConsonants(input);
    }

    public static void countVowelsAndConsonants(String input) {

        if(input == null || input.isEmpty()){
            System.out.println("Output: Vowels = 0, Consonants = 0");
        return;}

        int length = input.length() -1;
        int v =0;
        int c=0;

        while(length != -1){
           char letter = input.charAt(length);

           if(Character.isLetter(letter)){

           char letterL = Character.toLowerCase(letter);
               if(letterL=='a' || letterL=='e' || letterL=='i' || letterL=='o' || letterL=='u' ){
                   v++;
               }else{
                   c++;
               }
           }
            length --;
        }

        System.out.println("Output: Vowels ="+v+", Consonants ="+c);

    }
}
