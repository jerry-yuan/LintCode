package lintcode.q282;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
    /**
     * @param Message: the string xiao Q sent to xiao A.
     * @return: the string after decompress
     */
    public String DecompressString(String Message) {
        StringBuilder builder=new StringBuilder();
        StringBuilder subString;
        int i=0;
        while(i<Message.length()){
            if (Message.charAt(i) == '[') {
                int nextHr=Message.indexOf('|',i+1);
                int times=Integer.parseInt(Message.substring(i+1,nextHr));
                i=nextHr+1;
                int level=0;
                subString=new StringBuilder();
                while(level>-1 && i<Message.length()){
                    if(Message.charAt(i)=='['){
                        level++;
                    }else if(Message.charAt(i)==']'){
                        level--;
                    }
                    if(level>-1){
                        subString.append(Message.charAt(i));
                    }
                    i++;
                }
                String decompressedSubString=DecompressString(subString.toString());
                while(times-->0){
                    builder.append(decompressedSubString);
                }
            } else {
                builder.append(Message.charAt(i++));
            }
        }
        return builder.toString();
    }
}