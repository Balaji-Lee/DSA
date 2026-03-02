package DSA.array;

public class CheckIfNAndItsDoubleExist {

    // LEEDCODE https://leetcode.com/problems/check-if-n-and-its-double-exist/

    public static void main(String[] args) {

        int[] input = new int[] { 10, 2, 5, 3 };
        System.out.println("Result :" + checkIfExist(input));
    }

    public static boolean checkIfExist(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == 2 * arr[j]) {
                    return true;
                }
            }
        }
        return false;

    }

}
