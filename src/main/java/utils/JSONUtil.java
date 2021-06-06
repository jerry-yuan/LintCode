package utils;

import com.alibaba.fastjson.JSON;

import java.util.List;
import java.util.stream.Collectors;

public class JSONUtil {
    public static List<Integer> intList(String json) {
        return JSON.parseArray(json, Integer.class);
    }

    public static int[] intArray(String json) {
        return intList(json).stream().mapToInt(Integer::valueOf).toArray();
    }

    public static String[] stringArray(String json) {
        List<String> stringList=stringList(json);
        return stringList.toArray(new String[0]);
    }
    public static List<String> stringList(String json){
        return JSON.parseArray(json,String.class);
    }
    public static void print(Object o) {
        System.out.println(JSON.toJSONString(o, true));
    }
    public static int[][] intMatrix(String json){

        return JSON.parseObject(json,int[][].class);
    }
    public static char[][] charMatrix(String json){
        return stringList(json).stream().map(String::toCharArray).collect(Collectors.toList()).toArray(new char[0][0]);
    }
}
