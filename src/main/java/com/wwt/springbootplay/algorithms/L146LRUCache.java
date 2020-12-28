package com.wwt.springbootplay.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * @author grace
 * @date 2019-05-24 13:51
 */
public class L146LRUCache {
    //定义节点 双链表节点
    class Node {
        int key;
        int val;
        Node prev;
        Node next;
    }

    //容量
    private int capacity;
    //头结点
    private Node first;
    //尾节点
    private Node last;

    private Map<Integer, Node> map;

    //初始化容器
    public L146LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>(capacity);
    }

    /**
     * 存入node
     * @param key
     * @param value
     */
    public void put(int key, int value) {
        Node node = map.get(key);

        //如果map中没有当前元素
        if (node == null) {
            //那么构造新的节点
            node = new Node();
            node.key = key;
            node.val = value;

            //如果容量已满
            if (map.size() == capacity) {
                //删除最后元素
                removeLast();
            }

            //把当前节点放到头节点
            addToHead(node);
            map.put(key, node);
        } else {
            //如果当前map存在该key，则更新value, 并把该节点放到头节点
            node.val = value;
            moveToHead(node);
        }
    }

    /**
     * 添加到头节点
     *
     * @param node
     */
    private void addToHead(Node node) {
        //如果map是空的，那么头尾节点都是当前节点
        if (map.isEmpty()) {
            first = node;
            last = node;
        } else {
            //如果map不是空的，那么把当前节点变成头节点
            node.next = first;
            first.prev = node;
            first = node;
        }
    }

    /**
     * 移除最后一个节点
     */
    private void removeLast() {
        //从map中移除last节点
        map.remove(last.key);
        //尾节点的前一节点的变为尾节点
        Node prevNode = last.prev;
        if (prevNode != null) {
            prevNode.next = null;
            last = prevNode;
        }
    }


    /**
     * 获取节点，同时把节点放在first位置
     *
     * @param key
     * @return
     */
    public int get(int key) {
        Node node = map.get(key);
        if (node == null) {
            return -1;
        }
        moveToHead(node);
        return node.val;
    }

    /**
     * 把当前节点移动都头节点
     *
     * @param node
     */
    private void moveToHead(Node node) {
        //如果当前节点是头节点，那么不处理
        if (node == first) {
            return;
        } else if (node == last) {
            //如果当前节点是尾节点，那么把尾节点从链上摘除下来
            last.prev.next = null;
            last = last.prev;
        } else {
            //如果当前节点是中间节点，摘除，并处理好原有节点的关系
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        //连接当前节点和头节点
        node.prev = first.prev;
        node.next = first;
        //当前节点变成头节点
        first.prev = node;
        first = node;
    }


}
