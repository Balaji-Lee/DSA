class RotateArrayLeftByOne {

    public static void main(String[] args) {

        int[] myArray = new int[5];
        myArray[0] = 0;
        myArray[1] = 3;
        myArray[2] = 2;
        myArray[3] = 3;
        myArray[4] = 4;

        System.out.print("My Array Before Moving Left :: ");
        for (int n : myArray) {
            System.out.print(n);
        }

        int temp = myArray[0];

        for (int i = 0; i < myArray.length - 1; i++) {
            myArray[i] = myArray[i + 1];
        }
        myArray[myArray.length - 1] = temp;

        System.out.print(" My Array After Moving Left :: ");
        for (int n : myArray) {
            System.out.print(n);
        }

    }

}