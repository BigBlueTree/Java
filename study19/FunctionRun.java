package study19;

import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class FunctionRun {
	public static void main(String[] args) {
		Function<String,Integer> func = new Function<>() {
			@Override
			public Integer apply(String t) {
				return t.length();
			};
		};
		System.out.println(func.apply("몇개일까요?"));
		Function<String,Integer> func2 = str->str.length();
		System.out.println(func2.apply("나는 잘 몰라"));
		
		IntFunction<Double> ifd = num->num*1.3;
		System.out.println(ifd.apply(3));
		LongFunction<String> lfs = num->String.valueOf(num);
		System.out.println(lfs.apply(12L));
		DoubleFunction<Integer> dfi = num->(int)num;
		System.out.println(dfi.apply(12.1312241));
		BiFunction<String, String, String> bft = 
				(addr1,addr2)->addr1+" "+addr2;
		System.out.println(bft.apply("서울시", "용산구"));
		
		LongToDoubleFunction ltd = num->num;
		System.out.println(ltd.applyAsDouble(12L));
		LongToIntFunction lti = num->(int)num;
		System.out.println(lti.applyAsInt(1234L));
		
		ToIntFunction<String> tis = str->str.length();
		System.out.println(tis.applyAsInt("이건 길이가"));
		ToDoubleBiFunction<Integer, Double> tbf = 
				(intNum,doubleNum)->intNum*doubleNum;
		System.out.println(tbf.applyAsDouble(12, 13.34));
	}
}



