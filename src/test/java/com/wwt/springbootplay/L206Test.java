package com.wwt.springbootplay;

import com.wwt.springbootplay.algorithms.L206ReverseLinkedList;
import com.wwt.springbootplay.algorithms.base.ListNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author grace
 * @date 2019-05-21 18:32
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class L206Test {

    @Autowired
    private L206ReverseLinkedList l206ReverseLinkedList;

    @Test
    public void test() {
        System.out.println("test");
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode resultNode = l206ReverseLinkedList.reverseList(node1);
        System.out.println(resultNode);
    }
}
