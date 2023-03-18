package study18;

@FunctionalInterface
public interface FunctionInterface {
	void abMethod();//함수형 인터페이스는 메소드가 하나만
}
interface FunctionInterface1 {//input X output X
	void abMethod1();
}
interface FunctionInterface2 {//input X output O
	int abMethod2();
}
interface FunctionInterface3 {//input O output X
	void abMethod3(int i);
}
interface FunctionInterface4 {//input o output O
	double abMethod4(int i,double d);
}
