package com.wwt.springbootplay.algorithms;

import com.wwt.springbootplay.algorithms.base.ListNode;

/**
 * @author grace
 * @date 2019-05-24 15:30
 */
public class L21MergeTwoList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode headNode = new ListNode(0);
        ListNode currNode = headNode;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                currNode.next = l1;
                currNode = currNode.next;
                l1 = l1.next;
            }else{
                currNode.next = l2;
                currNode = currNode.next;
                l2 = l2.next;
            }
        }
        if(l1 != null){
            currNode.next = l1;
        }else{
            currNode.next = l2;
        }
        return headNode.next;
    }
}
