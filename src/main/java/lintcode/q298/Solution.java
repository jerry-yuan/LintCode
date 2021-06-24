package lintcode.q298;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    /**
     * @param n: an integer
     * @return: return all prime numbers within n.
     */
    public List<Integer> prime(int n) {
        // write your code here
        List<Integer> primes = new LinkedList<>();
        if (n < 1) {
            return primes;
        }
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        for (int i = 1; i < n; i++) {
            int theNumber = i + 1;
            if(!isPrime[i]){
                continue;
            }
            primes.add(theNumber);
            int multi=theNumber;
            while(multi<=n){
                isPrime[multi-1]=false;
                multi += theNumber;
            }
        }
        return primes;
    }
}
