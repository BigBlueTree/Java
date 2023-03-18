package study14;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceClass {
	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<>();
		hset.add("A");
		Set<String> hset2 = new HashSet<>(
				Arrays.asList("A","B","C"));
		Set<String> hset3 = new HashSet<>(
				List.of("A","B","C"));
		System.out.println(hset);
		hset2.addAll(hset3);
		System.out.println(hset2);
		System.out.println(hset3);
		
		LinkedHashSet<String> lset = new LinkedHashSet<>();
		lset.add("A");
		Set<String> lset2 = new LinkedHashSet<>(
				Arrays.asList("A","B","C"));
		System.out.println(lset);
		System.out.println(lset2);
		
		TreeSet<String> tset = new TreeSet<>();
		tset.add("A");
		Set<String> tset2 = new TreeSet<>(
				Arrays.asList("A","B","C"));
		System.out.println(tset);
		System.out.println(tset2);

	}
}


