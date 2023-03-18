package study19;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class SupplierRun {
	public static void main(String[] args) {
		Supplier<String> s = new Supplier<String>() {
			@Override
			public String get() {
				return "Supplier 반환값";
			}
		}; 
		System.out.println(s.get());
		
		Supplier<String> s2 = ()->{return "반환값";};
		Supplier<String> s3 = ()->"반환값";
		System.out.println(s3.get());
		
		BooleanSupplier bs = ()->{return (3>2);};
		IntSupplier is = ()->12+3;
		LongSupplier ls = ()->23L;
		DoubleSupplier ds = ()->12.34;
		System.out.println(bs.getAsBoolean());
		System.out.println(is.getAsInt());
		System.out.println(ls.getAsLong());
		System.out.println(ds.getAsDouble());
		
		
		
		
	}
}
