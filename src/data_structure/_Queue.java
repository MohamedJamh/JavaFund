package data_structure;

import java.util.LinkedList;
import java.util.Queue;

public class _Queue {
    public static void main(String[] args) {
        Queue<String> stringQueue = new LinkedList<>();

        //add to queue
        stringQueue.add("Hello");
        stringQueue.add("world");
        //retrieve first element
        System.out.println("First ele in the queue " + stringQueue.peek());
        //retrieve and deletes the first element in the queue
        System.out.println("delete element " + stringQueue.poll());
        //queue size
        System.out.println("queue size " + stringQueue.size());
        System.out.println(stringQueue);
    }
}
