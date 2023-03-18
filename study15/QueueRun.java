package study15;

import java.util.LinkedList;
import java.util.Queue;

public class QueueRun {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.add("나");
		queue.add("너");
		queue.add("우리");
		System.out.println(queue.element());
		System.out.println(queue);
		System.out.println(queue.remove());
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.peek());
		queue.offer("you");
		queue.offer("me");
		queue.offer("We");
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		//System.out.println(queue.element()); //예외 NoSuchElements
	}
}





