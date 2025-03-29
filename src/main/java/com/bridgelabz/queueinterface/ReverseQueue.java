package com.bridgelabz.queueinterface;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        // Adding elements to queue
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Queue: " + queue);
        System.out.println("Queue after reversing: " + reverseQueue(queue));
    }

    // Method to reverse queue using queue operations
    public static Queue<Integer> reverseQueue(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return queue;
        }

        int data = queue.peek();

        queue.remove();

        reverseQueue(queue);

        queue.add(data);

        return queue;
    }
}

/*
Input:
    Queue: [10, 20, 30]
Output:
    Queue after reversing: [30, 20, 10]
 */