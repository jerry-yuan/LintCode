package lintcode.q134;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private final int capacity;
    private Map<Integer, CacheNode> keyMaps = new HashMap<>();
    private CacheNode inward = new CacheNode();
    private CacheNode outward = new CacheNode();

    /*
     * @param capacity: An integer
     */
    public LRUCache(int capacity) {
        // do intialization if necessary
        this.capacity = capacity;
        inward.next=outward;
        outward.prev=inward;
    }

    /*
     * @param key: An integer
     * @return: An integer
     */
    public int get(int key) {
        // write your code here
        CacheNode node=keyMaps.get(key);
        if(node == null){
            return -1;
        }
        // 把node拿下来
        node.prev.next = node.next;
        node.next.prev = node.prev;
        // 把node放在头起
        node.prev=this.inward;
        node.next=this.inward.next;
        this.inward.next.prev = node;
        this.inward.next = node;
        return node.val;
    }

    /*
     * @param key: An integer
     * @param value: An integer
     * @return: nothing
     */
    public void set(int key, int value) {
        // write your code here
        if(get(key)!=-1){
            keyMaps.get(key).val=value;
            return;
        }
        CacheNode node = new CacheNode();
        node.val = value;
        node.key = key;
        if(keyMaps.size()>=capacity){
            CacheNode nodeToDelete = this.outward.prev;
            nodeToDelete.prev.next=nodeToDelete.next;
            nodeToDelete.next.prev=nodeToDelete.prev;
            keyMaps.remove(nodeToDelete.key,nodeToDelete);
        }
        // 放到头起
        node.prev=this.inward;
        node.next=this.inward.next;
        this.inward.next.prev=node;
        this.inward.next=node;
        keyMaps.put(node.key,node);
    }

    private static class CacheNode {
        int key;
        int val;
        CacheNode prev;
        CacheNode next;
    }
}