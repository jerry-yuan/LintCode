package lintcode.q471;

import java.util.Hashtable;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {
    /**
     * @param words: an array of string
     * @param k:     An integer
     * @return: an array of string
     */
    public String[] topKFrequentWords(String[] words, int k) {
        // write your code here
        Map<String, Integer> map = new Hashtable<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<Node> queue = new PriorityQueue<>();
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            queue.offer(new Node(e.getValue(), e.getKey()));
        }
        String[] results = new String[k];
        for (int i = 0; i < k && !queue.isEmpty(); i++) {
            results[i] = queue.poll().word;
        }
        return results;
    }

    public static class Node implements Comparable<Node> {
        public int count;
        public String word;

        public Node(int count, String word) {
            this.count = count;
            this.word = word;
        }

        @Override
        public int compareTo(Node o) {
            int intComp = Integer.compare(o.count, this.count);
            if (intComp != 0) {
                return intComp;
            }
            return this.word.compareTo(o.word);
        }
    }
}
