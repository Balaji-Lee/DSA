package DSA.array;
public class ReverseTheArray {

      /**
     * Prints the elements of the array in reverse order.
     *
     */
    public static void reverseAndPrint(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};  
        reverseAndPrint(arr);        
    }

}
