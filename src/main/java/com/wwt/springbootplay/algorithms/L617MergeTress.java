package com.wwt.springbootplay.algorithms;

import com.wwt.springbootplay.algorithms.base.TreeNode;

/**
 * @author grace
 * @date 2019-05-23 11:20
 */
public class L617MergeTress {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null) return t2;
        else if (t2 == null) return t1;
        else{
            t1.val = t1.val + t2.val;
            t1.left = mergeTrees(t1.left, t2.left);
            t1.right = mergeTrees(t1.right, t2.right);
            return t1;
        }
    }
}
