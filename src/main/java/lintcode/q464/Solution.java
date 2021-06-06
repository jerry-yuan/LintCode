package lintcode.q464;

import java.util.Arrays;

public class Solution {
    public void sortIntegers2(int[] A) {
        // write your code here
        qsort(A, 0, A.length - 1);
    }

    private void swap(int[] A, int a, int b) {
        if (a == b) return;
        A[a] = A[a] ^ A[b];
        A[b] = A[a] ^ A[b];
        A[a] = A[a] ^ A[b];
    }

    private void qsort(int[] A, int left, int right) {
        int l = left;
        int r = right;
        while (l < r) {
            while (A[l] < A[r]) l++;
            swap(A, l, r);
            while (A[l] < A[r]) r--;
            swap(A, l, r);
        }
        if (left < l - 1) qsort(A, left, l - 1);
        if (l + 1 < right) qsort(A, l + 1, right);
    }
}
