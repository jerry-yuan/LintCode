package lintcode.q550;

import java.util.*;

public class TopK {
    public final Map<String, Integer> map = new Hashtable<>();
    public final Comparator<String> fuckingComparator = new Comparator<String>() {

        @Override
        public int compare(String o1, String o2) {
            int intCmp = Integer.compare(map.getOrDefault(o1, 0), map.getOrDefault(o2, 0));
            if (intCmp != 0) {
                return -intCmp;
            }
            return o1.compareTo(o2);
        }
    };
    private final int k;
    private NavigableSet<String> topK = new TreeSet<>(fuckingComparator);

    /*
     * @param k: An integer
     */
    public TopK(int k) {
        // do intialization if necessary
        this.k = k;
    }

    /*
     * @param word: A string
     * @return: nothing
     */
    public void add(String word) {
        if (topK.contains(word)) {
            topK.remove(word);
        }
        map.put(word, map.getOrDefault(word, 0) + 1);
        topK.add(word);
        if (topK.size() > k) {
            topK.pollLast();
        }
    }

    /*
     * @return: the current top k frequent words.
     */
    public List<String> topk() {
        return new ArrayList<>(topK);
    }
}