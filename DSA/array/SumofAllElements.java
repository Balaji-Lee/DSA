package DSA.array;
public class SumofAllElements {

    public static void main(String[] arg) {
        int[] myArray = new int[] { 2, 3, 5, 11 };

        int sumVal = 0;

        for (int i = 0; i < myArray.length; i++) {
            sumVal = sumVal + myArray[i];
        }

        System.out.println("The Sum value ::" + sumVal);
    }

}
