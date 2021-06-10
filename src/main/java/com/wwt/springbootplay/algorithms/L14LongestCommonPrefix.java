package com.wwt.springbootplay.algorithms;

/**
 * @author wangwentao09
 * @date 2021-06-09 23:07
 * @desc
 */
public class L14LongestCommonPrefix {

    /**
     * 纵向比较
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        int count = strs.length;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            for (int j = 1; j < count; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return prefix.substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
