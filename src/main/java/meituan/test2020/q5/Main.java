package meituan.test2020.q5;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Queue<Event> priorityQueue=new PriorityQueue<>(N);

        for (int i = 0; i < N; i++) {
            priorityQueue.offer(new Event(i+1,scanner.nextInt(),scanner.nextInt()));
        }

        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll().id);
        }

    }

    public static class Event implements Comparable<Event> {
        public int id;
        public int necessary;
        public int priority;

        public Event(int id, int priority, int necessary) {
            this.id = id;
            this.necessary = necessary;
            this.priority = priority;
        }

        public int compareTo(Event o) {
            if (this.necessary > o.necessary) {
                return -1;
            } else if (this.necessary < o.necessary) {
                return 1;
            }
            if (this.priority > o.priority) {
                return -1;
            } else if (this.priority < o.priority) {
                return 1;
            }
            return 0;
        }
    }
}
