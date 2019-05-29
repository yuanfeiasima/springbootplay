package com.wwt.springbootplay;

import com.wwt.springbootplay.algorithms.L148SortList;
import com.wwt.springbootplay.algorithms.base.ListNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author grace
 * @date 2019-05-29 16:55
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class L148Test {

    @Autowired
    private L148SortList l148SortList;

    @Test
    public void test(){
        ListNode nodea1 = new ListNode(4);
        ListNode nodea2 = new ListNode(2);
        ListNode nodea3 = new ListNode(1);
        ListNode nodea4 = new ListNode(3);
        nodea1.next = nodea2;
        nodea2.next = nodea3;
        nodea3.next = nodea4;
        l148SortList.sortList(nodea1);
    }
}
