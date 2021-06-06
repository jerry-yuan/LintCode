package lintcode.q212;

public class Solution {
    /*
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
    public int replaceBlank(char[] string, int length) {
        // write your code here
        for(int i=0;i<length;i++){
            if(string[i]==' '){
                for(int j=length-1;j>i;j--){
                    string[j+2]=string[j];
                }
                string[i++]='%';
                string[i++]='2';
                string[i]='0';
                length+=2;
            }
        }
        return length;
    }
}