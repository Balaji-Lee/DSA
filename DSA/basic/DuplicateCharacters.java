import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Find duplicate characters in a string.
 * <p>
 * A duplicate character is a character that appears more than once.
 * <p>
 * Rules:
 * - Case-sensitive (for now)
 * - Consider only alphabetic characters
 * - Ignore spaces, digits, and special characters
 * - Do NOT use extra libraries (like Collections frequency helpers)
 * <p>
 * Edge Cases:
 * - null → no output
 * - empty string → no output
 * - string with no duplicates → no output
 * <p>
 * Example:
 * Input: "programming"
 * Output: r, g, m
 * <p>
 * Input: "Java"
 * Output: a
 * <p>
 * Input: "abcd"
 * Output: (no duplicates)
 * <p>
 * Time Expectation:
 * - O(n) or O(n²) is acceptable for interview basics
 */

public class DuplicateCharacters {

    public static void main(String[] args) {

        String input = "programming";
        findDuplicateCharacters(input);

    }

    public static void findDuplicateCharacters(String input) {

        if (input == null || input.isEmpty()) {
            return;
        }

        Map<Character, Integer> store = new HashMap<>();

        for (int j = 0; j < input.length()- 1; j++) {
            if(Character.isLetter(input.charAt(j))){
                char ch = input.charAt(j);
                store.put(ch, store.getOrDefault(ch, 0)+1);
            }
        }


        boolean found = false;
        for(Map.Entry<Character, Integer> entry: store.entrySet()){
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey()+" ");
                found = true;
            }
        }

        if(!found)
            System.out.println("No Duplicate");


    }
}
