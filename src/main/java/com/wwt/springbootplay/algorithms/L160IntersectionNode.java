package com.wwt.springbootplay.algorithms;

import com.wwt.springbootplay.algorithms.base.ListNode;
import org.springframework.stereotype.Service;

/**
 * 两个列表的相交节点
 * @author grace
 * @date 2019-05-29 15:47
 */
@Service
public class L160IntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode p = headA;
        ListNode q = headB;
        while(p != q ){
            p = p == null ? headB : p.next;
            q = q == null ? headA : q.next;
        }
        return p;
    }
}
