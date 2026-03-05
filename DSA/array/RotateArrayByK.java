package DSA.array;

import java.util.Arrays;

public class RotateArrayByK {

    /*
        Rotates an array to the right by k positions.
        
        Example:
        Input:
            arr = [1, 2, 3, 4, 5], k = 2
        Output:
            [4, 5, 1, 2, 3]
    */

    public static void main(String[] args) {

        int[] arr  = new int[]{1, 2, 3, 4, 5};
        int k =2;

        rotate(arr, k);

        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] nums, int k) {
        int length = nums.length;
        if(length == 0){
            return ;
        }
        int rotate = k % nums.length;
        revers(nums, 0, length-1);
        revers(nums, 0, rotate-1);
        revers(nums, rotate , length-1);
    }

    public static void revers(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start ++;
            end --;
        }
    }
}
