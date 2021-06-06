package lintcode.q492;

public class MyQueue {
    private QueueNode front;
    private QueueNode rear;

    public MyQueue() {
        front = null;
        rear = null;
    }

    /*
     * @param item: An integer
     * @return: nothing
     */
    public void enqueue(int item) {
        // write your code here
        QueueNode next = new QueueNode(item);
        if (rear == null && front == null) {
            front=rear=next;
        }else{
            assert rear != null;
            rear.next=next;
            rear=next;
        }
    }

    /*
     * @return: An integer
     */
    public int dequeue() {
        // write your code here
        int val=front.value;
        front = front.next;
        if(front==null){
            rear=null;
        }
        return val;
    }

    private static class QueueNode {
        int value;
        QueueNode next;

        public QueueNode(int value) {
            this.value = value;
        }
    }
}
