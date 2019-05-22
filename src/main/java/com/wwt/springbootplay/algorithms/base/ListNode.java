package com.wwt.springbootplay.algorithms.base;

import lombok.Data;

import javax.annotation.sql.DataSourceDefinition;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val;
    }

    @Override
    public int hashCode() {
        return Objects.hash(val);
    }
}
