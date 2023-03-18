package study19;
import java.util.function.*;
public class PredicateRun {
	public static void main(String[] args) {
		Predicate<Integer> p = new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return (t>3);
			}
		};
		System.out.println(p.test(4));
		Predicate<Integer> p2 = num->(num>3);
		System.out.println(p2.test(2));
		
		BiPredicate<String, String> bp = 
				(str1,str2)->str1.equals(str2);
		System.out.println(bp.test("apple", "apple"));
		
		IntPredicate ip = num->(num%2==0);
		System.out.println(ip.test(4));
		LongPredicate lp = num->(num>100);
		System.out.println(lp.test(102L));
		DoublePredicate dp = num->(num*20>100);
		System.out.println(dp.test(2.5));		
		
	}
}





