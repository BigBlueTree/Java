package test2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest1 {
	public static void main(String[] args) {
		StreamTest1 run = new StreamTest1();
		System.out.println(run.question1());
		System.out.println(run.question2());
		System.out.println(run.question3());
		for(Integer[] ints:run.question4()){
            System.out.printf("[%d,%d]",ints[0],ints[1]);
        }
		int dice1,dice2;
		for(dice1=1;dice1<=6;dice1++) {
			for(dice2=1;dice2<=6;dice2++) {
				if(dice1+dice2==6) {
					System.out.printf("[%d,%d]",dice1,dice2);
				}
			}
		}
	}
	
	private static final String[] STRARR= {"Pie","pi","P","cake"};
	//문자열 배열의 모든 문자열의 길이를 더한 결과를 출력
	//.mapToInt(  ) 해당 배열의 내부의 결과값을 Integer타입을 바꾼 스트림으로 반환
	public int question1() {
		return Arrays.stream(STRARR)
				.mapToInt(String::length)
				.sum();
	}
	//문자열 배열의 문자열 중에서 가장 긴 것의 길이를 출력
	public int question2() {
		return Arrays.stream(STRARR)
				.mapToInt(String::length)
				.max()
				.getAsInt();
	}
	//int->Integer 기본형->래퍼클래스 .boxed()
	//임의의 로또 번호(1-45)(6자리,중복불가)를 정렬하여 출력
	public String question3() {
		return new Random().ints(1,46)
				.distinct()
				.limit(6)
				.sorted()
				.boxed()
				.collect(Collectors.toList())
				.toString();
	}
	//두 개의 주사위를 구려서 나온 눈의 합이 6인 경우를 모두 출력
	public List<Integer[]> question4() {
		return IntStream.rangeClosed(1, 6)
				.boxed()
				.flatMap(i->
					IntStream.rangeClosed(1, 6)
					.boxed()
					.map(j->new Integer[] {i,j})
				)
				.filter(arr->arr[0]+arr[1]==6)
				.collect(Collectors.toList());
	}
}







