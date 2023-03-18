package study19;
import java.util.function.*;
public class OperatorRun {
	public static void main(String[] args) {
		UnaryOperator<Double> uo = new UnaryOperator<Double>() {
			@Override
			public Double apply(Double t) {
				return t*12.3;
			}
		};
		System.out.println(uo.apply(3.4));
		BinaryOperator<String> bo = new BinaryOperator<String>() {
			@Override
			public String apply(String t, String u) {
				return t+u;
			}
		};
		System.out.println(bo.apply("어서", "오세요"));
		
		UnaryOperator<Double> uo2 = dd->dd*12.3;
		System.out.println(uo2.apply(2.2));
		BinaryOperator<String> bo2 = (str1,str2)->str1+str2;
		System.out.println(bo2.apply("Hello", "World"));
		
		IntUnaryOperator iuo = num->num+3;
		System.out.println(iuo.applyAsInt(2));
		LongUnaryOperator luo = num->num+21L;
		System.out.println(luo.applyAsLong(23L));
		DoubleUnaryOperator duo = num->num*1.2;
		System.out.println(duo.applyAsDouble(3.2));
		
		IntBinaryOperator ibo = (num1,num2)->num1-num2;
		System.out.println(ibo.applyAsInt(12, 100));
		LongBinaryOperator lbo = (num1,num2)->num1-num2;
		System.out.println(lbo.applyAsLong(12L, 100L));
		DoubleBinaryOperator dbo = (num1,num2)->num1-num2;
		System.out.println(dbo.applyAsDouble(12.3, 12.42));
	}
}






