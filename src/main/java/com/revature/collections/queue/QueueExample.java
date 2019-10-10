package com.revature.collections.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.IntStream;

/**
 * Queue - First in  first out data structure
 *	Queues are frequently used for processing data, where new data
 *	comes into the queue, and is then processed one item at a time by
 *	a separate worker. This is often handled with separate threads.
 */
public class QueueExample {
	public static void main(String[] args) {
		Queue<Integer> myQueue = new LinkedList<>();
		
		myQueue.add(1);
		myQueue.add(2);
		myQueue.add(3);
		myQueue.add(4);
		
		// Queue processing loop
		while(!myQueue.isEmpty()) {
			System.out.println(myQueue.poll());
		}
		
		
		
	}
}
