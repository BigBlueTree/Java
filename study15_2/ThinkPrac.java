package study15_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;

public class ThinkPrac {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(
			List.of(3,6,2,2,2,7));
		HashSet<Integer> set = new HashSet<>(list);
		TreeSet<Integer> tset = new TreeSet<>(set);
		Stack<Integer> stack = new Stack<>();
		stack.addAll(tset);
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
	}
}


