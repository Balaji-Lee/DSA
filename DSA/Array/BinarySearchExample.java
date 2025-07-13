public class BinarySearchExample {

    public static void main(String[] arg) {
        int[] myArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 22 };
        int targetVal = 8;
        boolean found = false;
        int low = 0;
        int high = myArray.length - 1;

        int pos=0;

        System.out.println("Started");
        while (low <= high) {
            int mid = (low + high) / 2;
            if (myArray[mid] == targetVal) {
                found = true;
                pos =mid;
                break;
            } else if (myArray[mid] < targetVal) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println("❌ Value not found in the array.");
        } else {
            System.out.println(" found in the array at index:"+pos);
        }

    }
}
