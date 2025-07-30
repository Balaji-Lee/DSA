package DSA.array;

import java.util.ArrayList;
import java.util.List;

public class  FindAllNumbersDisappearedArray448{

       public static void main(String[] args) {

        int[] arr = new int[] { 1, 0, 2, 3, 0, 4, 5, 0 };
       List<Integer>  result = findDisappearedNumbers(arr);
        System.out.println("Result :" + result.toString());

    }


     public static  List<Integer> findDisappearedNumbers(int[] nums) {
         List<Integer> orgin = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (int n : nums) {
            orgin.add(n);
        
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!orgin.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }

}