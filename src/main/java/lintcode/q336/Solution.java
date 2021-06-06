package lintcode.q336;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * @param lines: the text to compress.
     * @return: return the text after compression.
     */
    public String[] textCompression(String[] lines) {
        // write your code here.
        String[] result = new String[lines.length];
        Map<String, Integer> stringMap = new HashMap<>();
        int wordIndex = 1;
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            StringBuilder builder = new StringBuilder();
            StringBuilder wordBuilder = new StringBuilder();
            for (int j = 0; j < line.length(); j++) {
                if ((line.charAt(j) <= 'z' && line.charAt(j) >= 'a') || (line.charAt(j) <= 'Z' && line.charAt(j) >= 'A')) {
                    wordBuilder.append(line.charAt(j));
                } else {
                    String word = wordBuilder.toString();
                    if (word.length() > 0) {

                        if (stringMap.containsKey(word)) {
                            builder.append(stringMap.get(word));
                        } else {
                            stringMap.put(word, wordIndex);
                            builder.append(word);
                            wordIndex++;
                        }
                        wordBuilder = new StringBuilder();
                    }
                    builder.append(line.charAt(j));
                }
            }
            String word = wordBuilder.toString();
            if (word.length() > 0) {
                if (stringMap.containsKey(word)) {
                    builder.append(stringMap.get(word));
                } else {
                    stringMap.put(word, wordIndex);
                    builder.append(word);
                    wordIndex++;
                }
                wordBuilder = new StringBuilder();
            }
            result[i] = builder.toString();
        }
        return result;
    }

}
