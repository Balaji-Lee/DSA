package DSA.array;

public class FindPeakElement {

    // LEEDCODE - https://leetcode.com/problems/find-peak-element/submissions/1935972970/?envType=problem-list-v2&envId=array

    public static void main(String[] args){

        int result = findPeakElement(new int[]{1,2,3,1});
        System.out.println(result);
    }

    public static int findPeakElement(int[] nums) {

        int length = nums.length;
        if(length == 0){
            return -1;
        }
        int peak = nums[0];
        int trackIndex =0;
        for(int i = 0; i < length; i++){
            if(peak< nums[i]){
                peak =nums[i];
                trackIndex = i;
            }
        }
        return trackIndex;

    }

}
