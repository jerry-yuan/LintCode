package utils;

public class LinkUtil {
    public static interface LinkNodeFactory<T,V>{
        T factory(V value);
        T getNext(T node);
        void setNext(T node,T next);
        void setValue(T node,V value);
    }
    public static <T> T deserializeAsIntegerLinkedList(int[] integers,LinkNodeFactory<T,Integer> factory){
        T head=factory.factory(-1);
        T pointer=head;
        for (int integer : integers) {
            T next = factory.factory(integer);
            factory.setNext(pointer, next);
            pointer = next;
        }
        return factory.getNext(head);
    }
}
