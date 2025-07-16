public class RotateArrayByK {

    /*
        Rotates an array to the right by k positions.
        
        Example:
        Input:
            arr = [1, 2, 3, 4, 5], k = 2
        Output:
            [4, 5, 1, 2, 3]
    */

    public static void main(String[] args) {

        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        int k = 6;

        // Handle cases where k > arr.length
        k = k % arr.length;

        // Create a result array to store rotated values
        int[] resultArr = new int[arr.length];

        // Core logic: Place each element at its new index
        for (int i = 0; i < arr.length; i++) {
            resultArr[(i + k) % arr.length] = arr[i];
        }

        // Print the rotated array
        System.out.print("Rotated Array: [");
        for (int i = 0; i < resultArr.length; i++) {
            System.out.print(resultArr[i]);
            if (i < resultArr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
