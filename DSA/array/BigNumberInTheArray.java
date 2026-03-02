package DSA.array;
public class BigNumberInTheArray {

    public static void main(String[] arg) {

        int[] myArray = new int[] { 22, 33, 21, 3, 277, 66, 200 };
        int max = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }

        System.out.println("Max Number in the Array :: "+ max);

    }

}