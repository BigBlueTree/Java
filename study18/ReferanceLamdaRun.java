package study18;

class NormalClass{
	void normalMethod() {
		System.out.println("일반메서드");
	}
	static void staticMethod() {
		System.out.println("정적메서드");
	}
}
interface IFforObj{
	void objectMethod(NCObj t,String k);
}
class NCObj{
	void printString(String str) {
		System.out.println(str+"객체메서드");
	}
}

public class ReferanceLamdaRun {
	public static void main(String[] args) {
		FunctionInterface fi1 = new FunctionInterface() {
			@Override
			public void abMethod() {
				NormalClass nc = new NormalClass();
				nc.normalMethod();
			}
		};
		fi1.abMethod();
		
		FunctionInterface fi2 = ()->{
			NormalClass nc = new NormalClass();
			nc.normalMethod();
		};
		fi2.abMethod();
		
		//참조변수::메서드
		NormalClass nc = new NormalClass();
		FunctionInterface fi3 = nc::normalMethod;
		fi3.abMethod();
		
		FunctionInterface fi4 = new FunctionInterface() {
			@Override
			public void abMethod() {
				NormalClass.staticMethod();
			}
		};
		fi4.abMethod();
		FunctionInterface fi41=()->{NormalClass.staticMethod();};
		fi41.abMethod();
		FunctionInterface fi42=()->NormalClass.staticMethod();
		fi42.abMethod();
		FunctionInterface fi43=NormalClass::staticMethod;
		fi43.abMethod();
		
		FunctionInterface3 fi5 = new FunctionInterface3() {
			@Override
			public void abMethod3(int i) {
				System.out.println(i);
			}
		};
		fi5.abMethod3(33);
		FunctionInterface3 fi51=(int i)->{System.out.println(i);};
		fi51.abMethod3(34);
		FunctionInterface3 fi52=i->System.out.println(i);
		fi52.abMethod3(35);
		FunctionInterface3 fi53=System.out::println;
		fi53.abMethod3(36);
		
		IFforObj iff = new IFforObj() {
			@Override
			public void objectMethod(NCObj t, String k) {
				t.printString(k);
			}
		};
		iff.objectMethod(new NCObj(), "아이고");
		IFforObj iff2 = (t,k)->t.printString(k);
		IFforObj iff3 = NCObj::printString;
		iff2.objectMethod(new NCObj(), "집에 가고싶어");		
		iff3.objectMethod(new NCObj(), "퇴근하고 싶어");
	}
}









