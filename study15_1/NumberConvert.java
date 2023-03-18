package study15_1;

import java.util.*;

public class NumberConvert {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(
			Arrays.asList(7,3,2,1,1,2,9,6,4,7,3,5,8,10,4));
		//중복제거, 오름차순 정렬
		TreeSet<Integer> numbers2 = new TreeSet<>(numbers);
		System.out.println(numbers2);
		NavigableSet<Integer> numbers3 = 
			new TreeSet<>(numbers).descendingSet();
		System.out.println(numbers3);
		//랜덤으로 1-10사이 20개의 숫자를 list에 저장하고 
		//중복제거 오름차순 내림차순으로 출력
		Random random = new Random();
		ArrayList<Integer> nums = new ArrayList<>();
		for(int i=0;i<20;i++) {
			int r = random.nextInt(10)+1;
			int r2 = (int)(Math.random()*10+1);
			nums.add(r);
		}
		System.out.println(nums);
		NavigableSet<Integer> nums2 = new TreeSet<Integer>(nums);
		System.out.println(nums2);
		System.out.println(nums2.descendingSet());
	}
}



