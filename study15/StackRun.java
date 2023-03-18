package study15;

import java.util.Stack;

public class StackRun {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("첫번째");
		stack.push("두번째");
		stack.push("세번째");
		stack.push("네번째");
		stack.push("다섯번째");
		System.out.println(stack);
		
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.size());
		
		System.out.println(stack.search("세번째"));
		System.out.println(stack.search("첫번째"));
		stack.push("여섯번째");
		System.out.println(stack.search("세번째"));
		System.out.println(stack.search("첫번째"));
		//System.out.println(stack.get(0));
		int size = stack.size();
		for(int i=0;i<size;i++) {
			System.out.println(stack.pop());
		}
		System.out.println(stack.empty());
		
	}
}
