package DSA.array;
public class BinarySearchExample {

    public static void main(String[] arg) {


        int[] arr = {1, 2, 44, 55, 88, 99, 112};
        int target = 55;

        int targetPosition =findPosition(arr, target);
        System.out.println("Target Position :" + targetPosition);
    }

    public static int findPosition(int[] array , int targetVal){

        int left = 0;
        int right = array.length-1;

        while( left <= right){
            int mid = (left + right) / 2;
            if(array[mid] == targetVal){
                return mid;
            }else if (array[mid] < targetVal){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return 0;
    }

}
