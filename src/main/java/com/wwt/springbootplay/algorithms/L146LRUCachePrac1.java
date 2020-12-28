package com.wwt.springbootplay.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * @author grace
 * @date 2019-05-24 13:51
 */
public class L146LRUCachePrac1 {
    //定义节点 双链表节点


    //容量

    //头结点

    //尾节点




    //初始化容器


    /**
     * 存入node
     * @param key
     * @param value
     */

        //如果map中没有当前元素
            //那么构造新的节点

            //如果容量已满
                //删除最后元素

            //把当前节点放到头节点
            //如果当前map存在该key，则更新value, 并把该节点放到头节点

    /**
     * 移动到头节点
     *
     * @param node
     */
        //如果map是空的，那么头尾节点都是当前节点
            //如果map不是空的，那么把当前节点变成头节点

    /**
     * 移除最后一个节点
     */
        //从map中移除last节点
        //尾节点的前一节点的变为尾节点


    /**
     * 获取节点，同时把节点放在first位置
     *
     * @param key
     * @return
     */

    /**
     * 把当前节点移动都头节点
     *
     * @param node
     */
        //如果当前节点是头节点，那么不处理
            //如果当前节点是尾节点，那么把尾节点从链上摘除下来
            //如果当前节点是中间节点，摘除，并处理好原有节点的关系

        //连接当前节点和头节点
        //当前节点变成头节点


}
