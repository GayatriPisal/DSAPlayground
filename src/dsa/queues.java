package dsa;


import java.util.LinkedList;
import java.util.Queue;


public class queues {

    public static void main(String[] args) {

        // Queue is a FIFO structure - First in first out
        // Linear data structure
        // enqueue = add at end = offer()
        // dequeue = remove first = poll()

        Queue<String> q = new LinkedList<>();
        
        q.offer("Lucy");
        q.offer("George");
        q.offer("Max");
        q.offer("Jane");

        System.out.println("Is queue empty? - "+ q.isEmpty());

        //removes first element from Queue
        q.poll();

        System.out.println("Queue -"+ q);

        //returns first element of queue without removing it from queue
        System.out.println("First in queue - "+ q.peek());

        //returns size of queue
        System.out.println("Queue size - "+ q.size());

        //returns true if element is present in queue
        System.out.println("Is Lucy in queue? - "+ q.contains("Lucy"));
        System.out.println("Is Max in queue? - "+ q.contains("Max"));


        //Uses of Queue:
        // used in LinkedList, Priority queue, BFS
        // print queues -print job should complete in order

    }
}
