import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListInsertAt {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>(Arrays.asList(1,2,3,4,5,6));
        list.add(0,0);
        System.out.println(list);
    }
}
