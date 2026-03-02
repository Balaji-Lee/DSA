package DSA.array;

import java.util.Arrays;

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

    public static void reversTheArrayByTwoPointer(int[] arr){
        int start =0;
        int end = arr.length-1;
        System.out.println("Start The Program");
        while(start != end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }

        System.out.println(Arrays.toString(arr));


    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};  
//        reverseAndPrint(arr);
        reversTheArrayByTwoPointer(arr);
    }

}
