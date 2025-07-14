public class LinearSearchExample {

    public static void main(String[] arg) {
        int[] myArray = new int[]{1,2,3,4,55};

        boolean isFivePresent =false;

        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i]==5){
                isFivePresent=true;
                break;
            }
        }

        if(isFivePresent){
            System.out.println("Yes 5 present");
        }else {
            System.out.println("No 5 not present");
        }

    }

// test

}
