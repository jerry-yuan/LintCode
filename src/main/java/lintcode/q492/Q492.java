package lintcode.q492;

import static utils.JSONUtil.print;

public class Q492 {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(438);
        print(myQueue.dequeue());
        myQueue.enqueue(452);
        myQueue.enqueue(379);
        myQueue.enqueue(884);
        myQueue.enqueue(332);
        myQueue.enqueue(55);
        print(myQueue.dequeue());
        myQueue.enqueue(825);
        print(myQueue.dequeue());
        print(myQueue.dequeue());
        print(myQueue.dequeue());
        print(myQueue.dequeue());
        myQueue.enqueue(983);
        print(myQueue.dequeue());
        print(myQueue.dequeue());
        myQueue.enqueue(616);
        myQueue.enqueue(66);
        print(myQueue.dequeue()); // return 2
    }
}
