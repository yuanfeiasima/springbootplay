package com.wwt.springbootplay.other;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

/**
 * @author wangwentao09
 * @date 2023-07-14 15:23
 * @desc
 */
public class CountingBloomFilterExample {

    public static void main(String[] args) {
        // 创建一个计数布隆过滤器，期望插入1000个元素，误判率为0.01
        BloomFilter<Integer> bloomFilter = BloomFilter.create(Funnels.integerFunnel(), 1000, 0.01);

        // 添加元素
        bloomFilter.put(1);
        bloomFilter.put(2);
        bloomFilter.put(3);

        // 判断元素是否存在
        System.out.println(bloomFilter.mightContain(1)); // true
        System.out.println(bloomFilter.mightContain(4)); // false

        // 获取元素的计数器
//        System.out.println(bloomFilter.getEstimatedCount(1)); // 1
//        System.out.println(bloomFilter.getEstimatedCount(2)); // 1
//        System.out.println(bloomFilter.getEstimatedCount(3)); // 1
//
//        // 删除元素
//        bloomFilter.remove(1);
//
//        // 判断元素是否存在
//        System.out.println(bloomFilter.mightContain(1)); // false
//
//        // 获取元素的计数器
//        System.out.println(bloomFilter.getEstimatedCount(1)); // 0
//        System.out.println(bloomFilter.getEstimatedCount(2)); // 1
//        System.out.println(bloomFilter.getEstimatedCount(3)); // 1
    }
}
