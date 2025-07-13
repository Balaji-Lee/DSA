public class CountOddAndEvenNumber {

    public static void main(String[] arg) {

        int[] myList = new int[] { 1, 22, 4, 4, 555, 6, 5, 4, 33, 32 };

        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < myList.length; i++) {
            if (myList[i] % 2 == 0) {
                oddCount++;
            } else {
                evenCount++;
            }
        }

        System.out.println("Odd count ::  "+ oddCount+ "  and the Even count:  "+evenCount);

    }

}
