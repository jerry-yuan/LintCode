package lintcode.q1281;

import java.util.*;

public class Solution {
    private Map<Integer, Integer> nCount;
    public int moveFlag(Node[] n,int left,int right){
        while(left<right){
            while(left<right && n[right].count<=n[left].count){
                right--;
            }
            swap(n,left,right);
            while(left<right && n[right].count<n[left].count){
                left++;
            }
            swap(n,left,right);
        }
        return left;
    }
    public void sortForTopK(Node[] n,int k,int left,int right){
        if(left>=right){
            return;
        }
        int mid=moveFlag(n,left,right);
        if(mid<k){
            sortForTopK(n,mid,left,mid-1);
            sortForTopK(n,k,mid+1,right);
        }else if(mid>k){
            sortForTopK(n,k,left,mid-1);
        }
    }
    public void swap(Node[] n,int a,int b){
        Node temp=n[a];
        n[a]=n[b];
        n[b]=temp;
    }
    /**
     * @param nums: the given array
     * @param k:    the given k
     * @return: the k most frequent elements
     */
    public List<Integer> topKFrequent(int[] nums, int k) {
        // Write your code here
        nCount = new HashMap<>();
        for (int i : nums) {
            nCount.put(i, nCount.getOrDefault(i, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(nCount.entrySet());
        Node[] nodes = new Node[entries.size()];
        for (int i = 0, len = entries.size(); i < len; i++) {
            nodes[i] = new Node(entries.get(i));
        }
        sortForTopK(nodes,k,0,nodes.length-1);
        List<Integer> data=new LinkedList<>();
        for(int i=0;i<k;i++){
            data.add(nodes[i].number);
        }
        return data;
    }

    public static class Node {
        int number;
        int count;

        public Node(Map.Entry<Integer, Integer> e) {
            this.number = e.getKey();
            this.count = e.getValue();
        }
    }
}
