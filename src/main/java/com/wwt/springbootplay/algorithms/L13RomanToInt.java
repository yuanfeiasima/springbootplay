package com.wwt.springbootplay.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * 罗马数字转整数
 * @author grace
 * @date 2019-07-19 11:30
 */
public class L13RomanToInt {
    /**
     * 注意罗马数字没有进制
     */
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        //用来存储结果
        int result = 0;
        char[] chars = s.toCharArray();
        //用来记录前一位
        int pre = 1000;
        for (char c : chars) {
            //当前位
            Integer current = map.get(c);
            //累加结果
            result += current;
            //如果当前位 大于 上一位，减2倍的上一位（因为之前加了一次）
            if (current > pre) {
                result = result - (2 * pre);
            }
            pre = current;
        }
        return result;
    }
}
