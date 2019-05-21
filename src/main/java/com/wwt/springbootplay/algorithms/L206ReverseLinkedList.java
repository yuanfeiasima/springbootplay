package com.wwt.springbootplay.algorithms;

import com.wwt.springbootplay.algorithms.base.ListNode;
import org.springframework.stereotype.Service;

/**
 * @author grace
 * @date 2019-05-20 14:09
 */
@Service
public class L206ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }

    /**
     * 递归
     *
     * @param current
     * @param pre
     * @return
     */
    private ListNode reverse(ListNode current, ListNode pre) {
        if (current == null) {
            return pre;
        }
        ListNode next = current.next;
        current.next = pre;
        return reverse(next, current);
    }

    /**
     * 非递归
     *
     * @param head
     * @return
     */
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // a -> b -> c -> d -> null
        // a <- b <- c <- d
        ListNode pre = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
