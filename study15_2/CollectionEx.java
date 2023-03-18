package study15_2;

import java.util.HashSet;
import java.util.Set;

public class CollectionEx {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60,70,40,30,20};
		Set<Integer> set = new HashSet<>();
		System.out.println("데이터\t삽입");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"\t"
				+(set.add(arr[i])?"성공":"중복"));
		}
		System.out.println("set"+set);
		//출력
		/*
		 * 데이터 삽입
		 * 10   성공
		 * 20	성공
		 * ...
		 * 40	중복
		 * 30	중복
		 * set[....]
		 */
	}
}
