package study18;

public class FunctionalInterfaceLamdaRun {
	public static void main(String[] args) {
		FunctionInterface1 ixox = new FunctionInterface1() {
			@Override
			public void abMethod1() {
				System.out.println("i x o x 메서드");
			}
		};
		ixox.abMethod1();
		ixox=()->System.out.println("i x o x 람다식");
		ixox.abMethod1();
		
		FunctionInterface2 ixoo = new FunctionInterface2() {
			@Override
			public int abMethod2() {
				System.out.println("i x o o 메서드");
				return 100;
			}
		};
		System.out.println(ixoo.abMethod2());
		ixoo = ()->{System.out.println("i x o o 람다식");return 100;};
		//ixoo = ()->100;
		System.out.println(ixoo.abMethod2());
		
		FunctionInterface3 ioox = new FunctionInterface3() {
			@Override
			public void abMethod3(int i) {
				System.out.println("i o o x 메서드"+i);
			}
		};
		ioox.abMethod3(10);
		ioox= i->System.out.println("i o o x 람다식"+i);
		ioox.abMethod3(11);
		
		FunctionInterface4 iooo = new FunctionInterface4() {
			@Override
			public double abMethod4(int i, double d) {
				System.out.println("i o o o 메서드");
				return i*d;
			}
		};
		System.out.println(iooo.abMethod4(9, 3.5));
		iooo = (i,d)->{
			System.out.println("i o o o 람다식");
			return i*d;
		};
		//iooo=(i,d)->i*d;
		System.out.println(iooo.abMethod4(9, 3.5));
	}
}










