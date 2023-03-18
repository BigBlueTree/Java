package study20;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamIntermediateOperatorRun {
	public static void main(String[] args) {
		IntStream is1 = IntStream.of(7,5,5,2,1,3,4,6,8,2,4,8,9);
		IntStream is2 = IntStream.of(7,5,5,2,1,3,4,6,8,9,3,5,7);
		//filter()
		is1.filter(num->num%2==0).forEach(e->System.out.print(e+" "));
		System.out.println();
		//distinct()
		is2.distinct().filter(num->num%2!=0).filter(num->num%3==0)
			.forEach(e->System.out.print(e+" "));
		System.out.println();
		//map()
		Stream<String> st1 = Stream.of("Html","CSS","java","ajax");
		st1.map(str->str.length())
			.forEach(e->System.out.print(e+" "));
		System.out.println();
		//flatMap()
		String[] arr = {"I study Html","You love CSS"
				,"java like javascript"};
		Stream<String> st2 = Arrays.stream(arr);
		st2.map(str->str.length())
		.forEach(e->System.out.print(e+" "));
		System.out.println();
		Stream<String> st3 = Arrays.stream(arr);
		st3.flatMap(str->Stream.of(str.split(" ")))
			.forEach(e->System.out.print(e+" "));
		System.out.println();
		//sorted()
		IntStream.of(14,10,21,35,27).sorted()
			.forEach(e->System.out.print(e+" "));
		System.out.println();
		List<String> lang = Arrays
				.asList("java","c","scala","go","python");
		lang.stream().sorted(Comparator.reverseOrder())
			.forEach(e->System.out.print(e+" "));
		System.out.println();
		//concat()
		Stream<String> st4 = Stream.of("Html","CSS","java","python");
		Stream<String> st5 = Stream.of("Htm2","CS2","jav2","pytho2");
		Stream.concat(st4, st5).forEach(e->System.out.print(e+" "));
		System.out.println();
		//peek()
		System.out.println(lang);
		lang.stream()
			.peek(System.out::println)
			.sorted(Comparator.reverseOrder())
			.peek(System.out::println)
			.sorted()
			.forEach(e->System.out.print(e+" "));
		System.out.println();
		//skip() limit()
		int sum = IntStream.of(1,42,12,51,67)
				//.skip(2)
				.limit(3)
				.peek(System.out::println)
				.sum();
		System.out.println(sum);
	}
}
