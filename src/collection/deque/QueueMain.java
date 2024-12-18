package collection.deque;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new ArrayDeque<>();
		
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		System.out.println(queue);
		
		System.out.println(queue.peek());
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue);
	}
}
