package com.wwt.springbootplay.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * @author grace
 * @date 2019-05-20 11:58
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int temp = target - nums[i];
            if(map.containsKey(temp) && map.get(temp) != i){
                return new int[]{map.get(temp), i};
            }
            map.put(nums[i], i);
        }
        throw new RuntimeException("can not find");
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] index = twoSum(nums, target);
        System.out.println(index);
    }
}
