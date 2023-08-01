package com.wwt.springbootplay.other;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * ConsistentHashing类是一致性哈希算法的实现类
 *
 * @author wangwentao09
 * @date 2023-07-14 14:34
 * @desc
 */
public class ConsistentHashing {

    private TreeMap<Long, String> virtualNodes = new TreeMap<Long, String>();
    private List<String> nodes = new ArrayList<String>();
    private int virtualNodesNum = 100;

    public ConsistentHashing(List<String> nodes, int virtualNodesNum) {
        this.nodes = nodes;
        this.virtualNodesNum = virtualNodesNum;
        for (String node : nodes) {
            for (int i = 0; i < virtualNodesNum; i++) {
                long hash = getHash(node + "-" + i);
                virtualNodes.put(hash, node);
            }
        }
    }

    public String getNode(String key) {
        long hash = getHash(key);
        SortedMap<Long, String> tailMap = virtualNodes.tailMap(hash);
        if (tailMap.isEmpty()) {
            return virtualNodes.get(virtualNodes.firstKey());
        }
        return tailMap.get(tailMap.firstKey());
    }

    private long getHash(String key) {
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] bytes = key.getBytes();
        md5.update(bytes);
        return new BigInteger(1, md5.digest()).longValue();
    }
}
