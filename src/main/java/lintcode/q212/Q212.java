package lintcode.q212;

import static utils.JSONUtil.print;

public class Q212 {
    public static void main(String[] args) {
        char[] buff=new char[1024];
        char[] data = "LintCode and Jiuzhang".toCharArray();

        System.arraycopy(data,0,buff,0,data.length);

        int len=new Solution().replaceBlank(buff,data.length);
        data=new char[len];
        System.arraycopy(buff,0,data,0,len);
        print(buff);
    }
}
