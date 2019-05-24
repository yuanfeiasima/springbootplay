package com.wwt.springbootplay;

import com.wwt.springbootplay.algorithms.L146LRUCache;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author grace
 * @date 2019-05-24 13:57
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class L146LRUCacheTest {

    @Test
    public void test(){
        int capcity = 2;
        L146LRUCache cache = new L146LRUCache(capcity);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);       // 返回  1
        cache.put(3, 3);    // 该操作会使得密钥 2 作废
        cache.get(2);       // 返回 -1 (未找到)
        cache.put(4, 4);    // 该操作会使得密钥 1 作废
        cache.get(1);       // 返回 -1 (未找到)
        cache.get(3);       // 返回  3
        cache.get(4);       // 返回  4
    }

}
