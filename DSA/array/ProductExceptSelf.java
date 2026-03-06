package DSA.array;

import java.util.Arrays;

public class ProductExceptSelf {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
        // Expected Result   [24,12,8,6]
    }
    public static int[] productExceptSelf(int[] nums) {

        int prifixPoint =0;
        int suffixPoint = nums.length-1;

        int[] prifixProduct = new int[nums.length];
        int[] suffixProduct = new int[nums.length];

        int prifixVal =1;
        int sufficVal =1;

        while(prifixPoint < nums.length ){

            prifixVal = prifixVal * nums[prifixPoint];
            prifixProduct[prifixPoint] = prifixVal;

            sufficVal = sufficVal  * nums[suffixPoint];
            suffixProduct[suffixPoint] = sufficVal;

            prifixPoint++;
            suffixPoint--;
        }

        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                nums[i] = suffixProduct[1] ;
            }else if( i == nums.length - 1){
                nums[i] = prifixProduct[nums.length - 2] ;
            }else{
                nums[i] = prifixProduct[i-1] * suffixProduct[i+1];
            }

        }

        return nums;

    }
}
