package DSA.array;
public class LinearSearchExample {

    public static void main(String[] arg) {

        int[] list = new int[]{1,2,44,55,66,67,69,88};
        int targetVal =67;

        int targetPosition = findPosition(list, targetVal);
        System.out.println("Target Position:"+ targetPosition);

    }

    public static int findPosition(int[] array , int target){
        int currentPosition =0;
        for (int v : array){
            if(v==target)
                return currentPosition;
            else
                currentPosition++;
        }
        return 1;
    }

}
