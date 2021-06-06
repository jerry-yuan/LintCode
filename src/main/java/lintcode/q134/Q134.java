package lintcode.q134;

public class Q134 {
    public static void main(String[] args) {
        LRUCache cache=new LRUCache(2);
        cache.set(2,1);
        cache.set(1,1);
        System.out.println(cache.get(2));
        cache.set(4,1);
        System.out.println(cache.get(1));
        System.out.println(cache.get(2));
    }
}
