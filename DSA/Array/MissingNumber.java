package DSA.array;
public class MissingNumber {
    /*
     Task:
     You're given an array containing n distinct numbers taken from the range 0 to n.
     This means exactly one number is missing from the range.

     Your job is to find and return that missing number.

     Input:
     int[] nums = {3, 0, 1};

     Output:2

     Explanation:
     The numbers from 0 to 3 are [0, 1, 2, 3], and 2 is missing.

     Constraints:
     - All numbers are unique
     - Array size is n, but values range from 0 to n
    */
    public static void main(String[] arg) {

        int[] nums = {3, 0, 2, 5, 1}; 
        int n = nums.length;
        int missingNumber = -1;

        for (int i = 0; i <= n; i++) { 
            boolean found = false;

            for (int j = 0; j < nums.length; j++) {
                if (i == nums[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                missingNumber = i;
                break;
            }
        }
        System.out.println(" Missing number is: " + missingNumber);
    }
    
    
}
