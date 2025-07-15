class RotateArrayByK {

/*
     🧪 Example:
     Input:
     arr = [1, 2, 3, 4, 5], k = 2

     Output:
     [4, 5, 1, 2, 3]
*/

    public static void main(String[] arg) {

        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        int k = 6;

        int[] resultArr = new int[arr.length];

        for (int m = 0; m < arr.length; m++) {
            resultArr[(m + k )% arr.length] = arr[m];
        }

        for (int o : resultArr) {
            System.out.print(o);
        }

    }
}