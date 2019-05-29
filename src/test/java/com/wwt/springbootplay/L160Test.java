package com.wwt.springbootplay;

import com.wwt.springbootplay.algorithms.L160IntersectionNode;
import com.wwt.springbootplay.algorithms.base.ListNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author grace
 * @date 2019-05-29 15:48
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class L160Test {

    @Autowired
    private L160IntersectionNode l160IntersectionNode;

    @Test
    public void test(){
        ListNode nodea1 = new ListNode(4);
        ListNode nodea2 = new ListNode(1);
        ListNode nodea3 = new ListNode(8);
        ListNode nodea4 = new ListNode(4);
        ListNode nodea5 = new ListNode(5);
        nodea1.next = nodea2;
        nodea2.next = nodea3;
        nodea3.next = nodea4;
        nodea4.next = nodea5;

        ListNode nodeb1 = new ListNode(5);
        ListNode nodeb2 = new ListNode(0);
        ListNode nodeb3 = new ListNode(1);
        ListNode nodeb4 = new ListNode(8);
        ListNode nodeb5 = new ListNode(4);
        ListNode nodeb6 = new ListNode(5);
        nodeb1.next = nodeb2;
        nodeb2.next = nodeb3;
        nodeb3.next = nodeb4;
        nodeb4.next = nodeb5;
        nodeb5.next = nodeb6;

        ListNode result = l160IntersectionNode.getIntersectionNode(nodea1, nodeb1);
        System.out.println(result);
    }
}
