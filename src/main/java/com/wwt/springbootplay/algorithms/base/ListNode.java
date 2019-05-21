package com.wwt.springbootplay.algorithms.base;

import lombok.Data;

import javax.annotation.sql.DataSourceDefinition;

/**
 * @author grace
 * @date 2019-05-20 14:13
 */
@Data
public class ListNode {
    int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
