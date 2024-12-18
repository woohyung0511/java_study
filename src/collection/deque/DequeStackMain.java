package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<Integer> deque = new ArrayDeque<>();
		
		deque.push(1);
		deque.push(2);
		deque.push(3);
		System.out.println(deque);
		
		System.out.println(deque.peek());
		
		System.out.println(deque.pop());
		System.out.println(deque.pop());
		System.out.println(deque.pop());
		System.out.println(deque);
	}

}
