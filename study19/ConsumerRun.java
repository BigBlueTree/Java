package study19;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerRun {
	public static void main(String[] args) {
		Consumer<String> c = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		c.accept("안녕하세요");
		Consumer<String> c2 = t->System.out.println(t);
		Consumer<String> c3 = System.out::println;
		c3.accept("안녕");
		
		IntConsumer c4 =num->System.out.println(num);
		LongConsumer c5=num->System.out.println(num);
		DoubleConsumer c6=num->System.out.println(num);
		BiConsumer<String,Integer> c7=
				(name,age)->System.out.print(name+age);
		c7.accept("윤미래", 40);
	}
}




