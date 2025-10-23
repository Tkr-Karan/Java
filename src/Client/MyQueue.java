package Client;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyQueue {
	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
		
		
		System.out.println(queue);
		
		
		Queue<Integer> pQueue = new PriorityQueue<>();
		
		
		pQueue.offer(20);
		pQueue.offer(10);
		pQueue.offer(2);
		pQueue.offer(30);
		
		
		System.out.println(pQueue);
		
		
		Queue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());
		
		
		maxQueue.offer(20);
		maxQueue.offer(10);
		maxQueue.offer(2);
		maxQueue.offer(30);
		
		System.out.println(maxQueue);
		
		
		
		List<Integer> aList = new ArrayList<Integer>();
	
	
		
	}
}
