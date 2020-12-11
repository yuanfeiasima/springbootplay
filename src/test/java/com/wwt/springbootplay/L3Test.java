package com.wwt.springbootplay;

import com.wwt.springbootplay.algorithms.L146LRUCache;
import com.wwt.springbootplay.algorithms.L3zuichangSubstring;
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
public class L3Test {

    @Autowired
    private L3zuichangSubstring l3zuichangSubstring;

    @Test
    public void test(){
        String s = "abcabcbb";
        int length = l3zuichangSubstring.lengthOfLongestSubstring(s);
    }
}
