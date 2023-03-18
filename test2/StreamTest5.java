package test2;

import java.util.List;

public class StreamTest5 {
	public static void main(String[] args) {
		List<String> strList = List.of("mango","banana","apple");
		//알파벳 순서로 정렬하여 콘솔창에 출력
		strList.stream().sorted().forEach(System.out::println);
	}
}
