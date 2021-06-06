package meituan.pretest2020Backend.q4;

import java.util.*;

public class Q4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wordCount = Integer.parseInt(scanner.nextLine());
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            words[i] = scanner.nextLine();
        }
        WordTreeNode root = new WordTreeNode(words);
        try {
            for (String word : words) {
                int endPos = root.findShortestPrefixLength(word);
                if (endPos > 0) {
                    endPos = 0;
                }
                endPos = word.length() + endPos;
                System.out.println(word.substring(0, endPos));
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    private static class WordTreeNode {
        private final Map<Character, WordTreeNode> children;

        public WordTreeNode(String[] words) {
            children = new HashMap<>();
            Map<Character, List<String>> cutPrefixWordMap = new HashMap<>();
            for (String word : words) {
                if ("".equals(word)) {
                    if (!cutPrefixWordMap.containsKey((char) 0)) {
                        cutPrefixWordMap.put((char) 0, new LinkedList<>());
                    }
                } else {
                    Character first = word.charAt(0);
                    List<String> cutPrefixWords = cutPrefixWordMap.getOrDefault(first, new LinkedList<>());
                    cutPrefixWords.add(word.substring(1));
                    cutPrefixWordMap.putIfAbsent(first, cutPrefixWords);
                }
            }
            for (Map.Entry<Character, List<String>> entry : cutPrefixWordMap.entrySet()) {
                children.put(entry.getKey(), new WordTreeNode(entry.getValue().toArray(new String[0])));
            }
        }

        private int findShortestPrefixLength(String toSearch) {
            char firstCh;
            int sub;
            if ("".equals(toSearch)) {
                firstCh = (char) 0;
                sub = this.children.get(firstCh).findShortestPrefixLength("");
            } else {
                firstCh = toSearch.charAt(0);
                sub = this.children.get(firstCh).findShortestPrefixLength(toSearch.substring(1));
            }
            if (sub < 0) {
                return sub;
            }
            if(this.children.isEmpty()){
                return 0;
            }
            if (this.children.size() > 1) {
                return -sub;
            }
            return sub + 1;
        }
    }
}
