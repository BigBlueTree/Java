package study15_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SetCalPrac {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>(
			Arrays.asList(1,2,3,4));
		ArrayList<Integer> list2 = new ArrayList<>(
				Arrays.asList(3,4,5,6));
		ArrayList<Integer> intersection = new ArrayList<>();//교집합
		ArrayList<Integer> union = new ArrayList<>();//합집합
		ArrayList<Integer> subtraction = new ArrayList<>();//차집합
		//교집합
//		intersection.addAll(list1);
//		intersection.retainAll(list2);
		for(int i=0;i<list1.size();i++) {
			if(list2.contains(list1.get(i))) {
				intersection.add(list1.get(i));
			}
		}
		//합집합
//		HashSet<Integer> temp = new HashSet<>();
//		temp.addAll(list1);
//		temp.addAll(list2);
//		union.addAll(temp);
		for(int i:list1) {
			if(!(list2.contains(i))) {
				union.add(i);
			}
		}
		union.addAll(list2);
		
		//차집합
//		subtraction.addAll(list1);
//		subtraction.removeAll(list2);
		for(int i:list1) {
			if(!(list2.contains(i))) {
				subtraction.add(i);
			}
		}
		
				
		System.out.println(list1);
		System.out.println(list2);
		System.out.println("교집합"+intersection);//[3,4]
		System.out.println("합집합"+union);	//[1,2,3,4,5,6]
		System.out.println("차집합"+subtraction); //[1,2]
			
	}
}
