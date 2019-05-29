package com.wwt.springbootplay.algorithms;

import com.wwt.springbootplay.algorithms.base.ListNode;
import org.springframework.stereotype.Service;

/**
 * @author grace
 * @date 2019-05-29 16:55
 */
@Service
public class L148SortList {
    public ListNode sortList(ListNode head) {
        return head == null ? null : mergeSort(head);
    }
    private ListNode mergeSort(ListNode head){
        if(head.next == null){
            return head;
        }
        ListNode p = head, q = head, pre = null;
        while(q != null && q.next != null){
            pre =  p;
            p = p.next;
            q = q.next.next;
        }
        pre.next = null;
        ListNode l = mergeSort(head);
        ListNode r = mergeSort(p);
        return merge(l, r);
    }

    ListNode merge(ListNode l, ListNode r){
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        while(l != null && r != null){
            if(l.val <= r.val){
                cur.next = l;
                cur = cur.next;
                l = l.next;
            }else{
                cur.next = r;
                cur = cur.next;
                r = r.next;
            }
        }

        if(l != null){
            cur.next = l;
        }
        if(r != null){
            cur.next = r;
        }
        return dummyHead.next;
    }
}
