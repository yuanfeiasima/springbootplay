package com.wwt.springbootplay;

import com.wwt.springbootplay.algorithms.L3zuichangSubstring;
import com.wwt.springbootplay.algorithms.L55CanJump;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author wangwentao09
 * @date 2020-12-11 12:41
 * @desc
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class L55Test {

    @Autowired
    private L55CanJump l55CanJump;

    @Test
    public void test() {
        int[] nums = new int[]{2,3,1,1,4};
        boolean flag = l55CanJump.canJump(nums);
    }
}
