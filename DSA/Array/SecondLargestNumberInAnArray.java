public class SecondLargestNumberInAnArray {

    public static void main(String[] arg) {
        int[] myArray = new int[] { 1, 2, 3, 6, 33, 444, 44, 45, 7777 };

        int max = Integer.MIN_VALUE;
        int secoundMax = Integer.MIN_VALUE;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max) {
                secoundMax = max;
                max = myArray[i];
            } else if (myArray[i] > secoundMax && myArray[i] != max) {
                secoundMax = myArray[i];
            }
        }

        System.out.println("Secound Max value is :: " + secoundMax);

    }

}
