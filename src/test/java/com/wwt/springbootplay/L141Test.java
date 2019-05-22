package com.wwt.springbootplay;

import com.wwt.springbootplay.algorithms.L141CycleNode;
import com.wwt.springbootplay.algorithms.base.ListNode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author grace
 * @date 2019-05-22 18:05
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class L141Test {

    @Autowired
    private L141CycleNode l141CycleNode;

    @Test
    public void test() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        boolean flag = l141CycleNode.hasCycle(node1);
        Assert.assertFalse(flag);

        node5.next = node3;
        flag = l141CycleNode.hasCycle(node1);
        Assert.assertTrue(flag);
    }
}
