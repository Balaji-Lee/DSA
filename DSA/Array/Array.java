package DSA.array;
import java.util.Scanner;
public class Array {

    /*
     * Try writing a simple Java program to:
     * 
     * Create an array of size 5.
     * Take 5 numbers as input from the user.
     * Print all elements.
     */
    public static void main(String[] arg) {

        int[] x = new int[2];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 5 numbers");

        for (int i = 0; i < x.length; i++) {
            System.out.println("Enter number for " + (i + 1) + ":");
            x[i] = scan.nextInt();
        }

        System.out.println("Enter Number are listed Bellow");

        for (int i = 0; i < x.length; i++) {
            System.out.println("At Position " + (i + 1) + "::" + x[i]);
        }

        scan.close();

    }
}