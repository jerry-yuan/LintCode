package lintcode.q15;

import java.util.*;

public class Solution {
    /*
     * @param nums: A list of integers.
     * @return: A list of permutations.
     */
    public List<List<Integer>> permute(int[] nums) {
        // write your code here
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        return genLists(set);
    }
    public List<List<Integer>> genLists(Set<Integer> remain){
        List<List<Integer>> result=new LinkedList<>();
        if(remain.isEmpty()){
            result.add(new ArrayList<>());
        }else{
            Set<Integer> nextRemain;
            for(Integer i:remain){
                nextRemain=new HashSet<>(remain);
                nextRemain.remove(i);
                List<List<Integer>> subResult=genLists(nextRemain);
                for (List<Integer> list:subResult){
                    List<Integer> integers=new LinkedList<>();
                    integers.add(i);
                    integers.addAll(list);
                    result.add(integers);
                }
            }
        }
        return result;
    }
}
