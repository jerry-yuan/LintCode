package lintcode.q25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    /**
     * @param n: An integer.
     * @return: A string list.
     */
    public List<String> printX(int n) {
        // write your code here
        String[] XShape=new String[n];
        for (int i = 0; i < n / 2; i++) {
            StringBuilder sb=new StringBuilder();
            for (int j = 0; j < i; j++) {
                sb.append(" ");
            }
            sb.append("X");
            for (int j = 0; j < n - i*2-2; j++) {
                sb.append(" ");
            }
            sb.append("X");
            for (int j = 0; j < i; j++) {
                sb.append(" ");
            }
            XShape[i]=sb.toString();
            XShape[n-i-1]=sb.toString();
        }
        if(n%2>0){
            StringBuilder sb=new StringBuilder();
            for (int j = 0; j < n/2; j++) {
                sb.append(" ");
            }
            sb.append("X");
            for (int j = 0; j < n /2; j++) {
                sb.append(" ");
            }
            XShape[n/2]=sb.toString();
        }
        return Arrays.asList(XShape);
    }
}
