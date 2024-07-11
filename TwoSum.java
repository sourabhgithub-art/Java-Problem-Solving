/*
int[] nums = {2, 7, 11, 15};
int target = 9;
Output should be the indices [0, 1] because nums[0] + nums[1] = 2 + 7 = 9.
*/


import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> map = new HashMap<>();
       for(int i = 0; i < nums.length;i++){
           int value = target - nums[i];
           if(map.containsKey(value)){
               return new int[] {map.get(value),i};
           }
           map.put(nums[i],i);
       }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 15, 7};
        int target = 9;
        int [] result = twoSum(nums,target);
        System.out.println(result[0] + "," +result[1]);
    }
}