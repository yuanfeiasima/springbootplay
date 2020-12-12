package com.wwt.springbootplay.algorithms;

import org.springframework.stereotype.Service;

/**
 * @author wangwentao09
 * @date 2020-12-12 00:33
 * @desc
 */
@Service
public class L55CanJump {

    public boolean canJump(int[] nums) {
        int n = nums.length;
        int rightMost = 0;
        for(int i = 0; i < n; ++i){
            if (i <= rightMost) {
                rightMost = Math.max(rightMost, i + nums[i]);
                if (rightMost >= n - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
