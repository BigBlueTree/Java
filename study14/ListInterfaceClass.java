package study14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterfaceClass {
	public static void main(String[] args) {
		//객체 생성
		List<Integer> alist = new ArrayList<>();
		List<Integer> llist = new LinkedList<>();
		List<Integer> vec = new Vector<>();//호환 동기화
		long start= 0;
		long end = 0;
		//추가
		start = System.nanoTime();
		for(int i=0;i<99999;i++) {
			alist.add(0,i);
		}
		end = System.nanoTime();
		System.out.printf("ArrayList  : %11d\n",(end-start));
		start = System.nanoTime();
		for(int i=0;i<99999;i++) {
			llist.add(0,i);
		}
		end = System.nanoTime();
		System.out.printf("LinkedList : %11d\n",(end-start));
		//읽기
		start = System.nanoTime();
		for(int i=0;i<99999;i++) {
			alist.get(i);
		}
		end = System.nanoTime();
		System.out.printf("ArrayList  : %11d\n",(end-start));
		start = System.nanoTime();
		for(int i=0;i<99999;i++) {
			llist.get(i);
		}
		end = System.nanoTime();
		System.out.printf("LinkedList : %11d\n",(end-start));
		//삭제
		start = System.nanoTime();
		for(int i=0;i<99999;i++) {
			alist.remove(0);
		}
		end = System.nanoTime();
		System.out.printf("ArrayList  : %11d\n",(end-start));
		start = System.nanoTime();
		for(int i=0;i<99999;i++) {
			llist.remove(0);
		}
		end = System.nanoTime();
		System.out.printf("LinkedList : %11d\n",(end-start));
	}
}



