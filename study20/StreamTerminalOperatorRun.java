package study20;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTerminalOperatorRun {
	public static void main(String[] args) {
		int[] arr = {1,3,5,8,9,10};
		//count()
		long count = Arrays.stream(arr).count();
		System.out.println(count);
		//sum()
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		//min() max()
		OptionalInt min = Arrays.stream(arr).min();
		OptionalInt max = Arrays.stream(arr).max();
		System.out.println(min.getAsInt()+" "+max.getAsInt());
		//average()
		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println(avg.getAsDouble());
		//reduce()
		Arrays.stream(arr).reduce(Integer::sum)
			.ifPresent(System.out::println);
		System.out.println(Arrays.stream(arr)
				.reduce(20, Integer::sum));
		Arrays.stream(arr).reduce((x,y)->x-y)
			.ifPresent(System.out::println);
		Arrays.stream(arr).parallel().reduce((x,y)->x-y)
			.ifPresent(System.out::println);
		//find
		Arrays.stream(arr).findFirst()
			.ifPresent(System.out::println);
		Arrays.stream(arr).findAny()
			.ifPresent(System.out::println);
		List<String> elements = Arrays.asList("A","AB","C","CD","E","EF");
		Optional<String> firstEle = elements.stream().parallel()
			.filter(str->str.startsWith("C"))
			.findFirst();
		System.out.println("first "+firstEle.get());
		Optional<String> anyEle = elements.stream().parallel()
			.filter(str->str.startsWith("C")).findAny();
		System.out.println("Any "+anyEle.get());
		//Match
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.stream(arr).anyMatch(num->num>8));
		System.out.println(Arrays.stream(arr).allMatch(num->num<9));
		System.out.println(Arrays.stream(arr).noneMatch(num->num>9));
		
//collect()
//배열 컬렉션 변환:toArray(),toList(),toSet(),toMap()
//통계 연산:counting(),maxBy(),minBy(),summingInt(),averagingInt()....
//요소를 처리: reducing(),joining()
//그룹,분할: groupingBy(),partitionBy()
		Stream<String> streamEx = Stream.of("나","너","우리","당신");
		List<String> list = streamEx.collect(Collectors.toList());
		System.out.println(list);
		
		String[] sarr = {"apple","orange","lemon","banana"};
		System.out.println(
			Arrays.stream(sarr).collect(Collectors.joining()));
		System.out.println(
			Arrays.stream(sarr).collect(
				Collectors.joining(", ","[","]")));
		System.out.println(Arrays.toString(sarr));
		
		List<Integer> nums = Arrays.asList(1,2,5,6,87,2);
		Double avg2 = nums.stream().collect(
			Collectors.averagingDouble(num->num));
		Integer sum2 = nums.stream().collect(
			Collectors.summingInt(num->num+2));
		System.out.println(avg2+" "+sum2);
		
		Stream<Integer> stream = Stream.of(25,50,75,100,125,150);
		Map<Boolean,List<Integer>> m = stream.collect(
			Collectors.partitioningBy(a->a>50));
		System.out.println(m);
		System.out.println(m.get(false));
		
		Stream <Integer> stream2 = Stream.of(25,50,75,100,125,150);
		Map<Boolean,List<Integer>> m2 = stream2.collect(
			Collectors.groupingBy(a->a>50));
		System.out.println(m2);
		
		List<String> list2 = Stream.of("test1","test2").collect(
			Collectors.collectingAndThen(Collectors.toList(),
				Collections::<String>unmodifiableList));
		System.out.println(list2);
		
		
		
		
		
		
		
		
	}
}
