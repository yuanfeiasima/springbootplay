package com.wwt.springbootplay.algorithms;

import com.wwt.springbootplay.algorithms.base.ListNode;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author grace
 * @date 2019-05-22 18:00
 */
@Service
public class L141CycleNode {

    public boolean hasCycle(ListNode node) {
        Set<ListNode> set = new HashSet<>();
        while (node != null) {
            if (set.contains(node)) {
                return true;
            } else {
                set.add(node);
                node = node.next;
            }
        }
        return false;
    }
}
