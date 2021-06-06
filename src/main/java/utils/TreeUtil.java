package utils;

import java.util.ArrayList;

public class TreeUtil {
    public static interface TreeNodeFactory<T,V>{
        T factory(V val);
        void setLeft(T root,T left);
        void setRight(T root,T right);
        void setValue(T root,V value);
    }
    public static <T> T deserializeAsIntegerTree(String data,TreeNodeFactory<T,Integer> factory){
        if (data.equals("{}")) {
            return null;
        }
        String[] vals = data.substring(1, data.length() - 1).split(",");
        ArrayList<T> queue = new ArrayList<T>();
        T root = factory.factory(Integer.parseInt(vals[0]));
        queue.add(root);
        int index = 0;
        boolean isLeftChild = true;
        for (int i = 1; i < vals.length; i++) {
            if (!vals[i].equals("#")) {
                T node = factory.factory(Integer.parseInt(vals[i]));
                if (isLeftChild) {
                    factory.setLeft(queue.get(index),node);
                } else {
                    factory.setRight(queue.get(index),node);
                }
                queue.add(node);
            }
            if (!isLeftChild) {
                index++;
            }
            isLeftChild = !isLeftChild;
        }
        return root;
    }
}
