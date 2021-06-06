package lintcode.q562;

import static utils.JSONUtil.print;

public class Solution {
    /**
     * @param nums:        an integer array and all positive numbers, no duplicates
     * @param packageSize: An integer
     * @return: An integer
     */
    public int backPackIV(int[] nums, int packageSize) {
        // write your code here
        int[][] cases = new int[nums.length][packageSize + 1];
        // 第一行
        for (int currentSize = 0; currentSize <= packageSize; currentSize++) {
            if(currentSize % nums[0]==0)
                cases[0][currentSize] = 1;
        }
        //剩下的
        for (int itemIdx = 1; itemIdx < nums.length; itemIdx++) {
            for (int currentSize = 0; currentSize <= packageSize; currentSize++) {
                if (currentSize < nums[itemIdx]) {
                    // 放不下itemIdx的情况
                    cases[itemIdx][currentSize] = cases[itemIdx - 1][currentSize];
                } else {
                    // 统计至少放一个itemIdx的情况
                    cases[itemIdx][currentSize] = cases[itemIdx - 1][currentSize];
                    int totalCopies = currentSize / nums[itemIdx];
                    System.out.println("nums[" + itemIdx + "]=" + nums[itemIdx] + " 在背包容积为" + currentSize + "时最多能放 " + totalCopies);
                    for (int copyIdx = 0; copyIdx < totalCopies; copyIdx++) {
                        int remainSize = currentSize - (copyIdx + 1) * nums[itemIdx];
                        System.out.println("\t放" + (copyIdx + 1) + "个nums[" + itemIdx + "] 剩余" + remainSize);
                        cases[itemIdx][currentSize] += cases[itemIdx - 1][remainSize];
                    }
                }
            }
        }
        for (int[] i : cases) {
            print(i);
        }
        return cases[nums.length - 1][packageSize];
    }
}