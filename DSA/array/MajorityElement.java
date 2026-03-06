package DSA.array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {

        System.out.println(majorityElement(new int[]{2,1,1,1,2,2,2}));

    }

    public static  int majorityElement(int[] nums) {

        Map<Integer, Integer> store = new HashMap<>();
        int count =0;
        int value =0;

        for(int num : nums){
            store.put(num, store.getOrDefault(num, 0)+1);
        }

        for(Map.Entry<Integer, Integer> current: store.entrySet()){
            if(nums.length/2 < current.getValue() ){
                if(count<current.getValue()){
                    count=current.getValue();
                    value=current.getKey();
                }
            }
        }

        return value;

    }
}
