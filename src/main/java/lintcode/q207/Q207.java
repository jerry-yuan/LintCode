package lintcode.q207;

import static utils.JSONUtil.intArray;

public class Q207 {
    public static void testCase1(){
        Solution solution=new Solution(intArray("[1,2,7,8,5]"));

        System.out.println(solution.query(0,2));
        solution.modify(0,4);
        System.out.println(solution.query(0,1));
        solution.modify(2,1);
        System.out.println(solution.query(2,4));
    }
    public static void testCase2(){
        Solution solution=new Solution(intArray("[10]"));

        System.out.println(solution.query(0,0));
        solution.modify(0,9);
        System.out.println(solution.query(0,0));
    }
    public static void main(String[] args) {

        testCase2();

    }
}
