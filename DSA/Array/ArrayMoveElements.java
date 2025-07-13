import java.util.Scanner;

public class ArrayMoveElements {
    public static void main(String[] arg) {

        int[] myArray = new int[5];

        System.out.println("Enter 4 value in the array But it can hold 5 ");

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter vale for " + (i + 1) + "::");
            myArray[i] = scan.nextInt();
        }
        System.out.println("My Array is Reay this before Insearting new value in the middel for the Array");

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("At position " + myArray[i]);
        }

        System.out.println("Enter the 5th Value::");
        int newvale = scan.nextInt();

        System.out.println("Enter the position of the value::");
        int pos = scan.nextInt();

        for (int i = 4; i > pos; i--) {
            myArray[i] = myArray[i - 1];
        }

        myArray[pos] =newvale;

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("At position " + myArray[i]);
        }
        scan.close();

    }
}
