package lintcode.q90;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    /*
     * @param A: an integer array
     * @param k: a postive integer <= length(A)
     * @param target: an integer
     * @return: A list of lists of integer
     */
    public List<List<Integer>> kSumII(int[] A, int k, int target) {
        // write your code here
        return getSum(A,k,target,0);
    }

    public List<List<Integer>> getSum(int[] A, int k, int target, int begin) {
        List<List<Integer>> seqs = new LinkedList<>();
        for (int i = begin; i < A.length; i++) {
            int nextTarget = target - A[i];
            if(k>1) {
                List<List<Integer>> subSeqs = getSum(A, k - 1, nextTarget, i + 1);
                for (List<Integer> subSeq : subSeqs) {
                    subSeq.add(0, A[i]);
                }
                seqs.addAll(subSeqs);
            }else if(nextTarget==0){
                seqs.add(new LinkedList<>(Collections.singleton(A[i])));
            }
        }
        return seqs;
    }
}
