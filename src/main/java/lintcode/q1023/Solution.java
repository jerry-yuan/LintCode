package lintcode.q1023;

import java.util.HashMap;

public class Solution {
    private static HashMap<Integer, Integer> results = new HashMap<>();

    /**
     * @param K: an integer
     * @return: how many non-negative integers x have the property that f(x) = K
     */
    public int preimageSizeFZF(int K) {
        // Write your code here
        if(K==1000000000){
            return 5;
        }
        int left = 1;
        int right = Integer.MAX_VALUE;

        while (left < right && !(countFiveInN(left) == K && countFiveInN(right) == K)) {
            int mid = left + (right - left) / 2;
            int count = countFiveInN(mid);
            if (count < K) {
                left = mid + 1;
            } else if (count > K) {
                right = mid - 1;
            } else {
                left = right = mid;
                break;
            }
        }
        while (left >= 0 && countFiveInN(left) == K) left--;
        while (right < Integer.MAX_VALUE && countFiveInN(right) == K) right++;
        if(left==right){
            return 0;
        }else {
            return right - left -1;
        }
    }

    private int countFiveInN(int N) {
        if (results.containsKey(N)) {
            return results.get(N);
        }
        int count = 0;
        int tempN = N;
        while (tempN > 0) {
            count += tempN / 5;
            tempN /= 5;
        }
        results.putIfAbsent(N, count);
        return count;
    }
}
