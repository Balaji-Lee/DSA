public class ReverseTheArray {

    public static void main(String[] arg) {

        int[] myArray = new int[] { 1, 2, 3, 4, 5 };

        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.println(myArray[i]);
        }

    }

}
