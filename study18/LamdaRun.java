package study18;
//함수형 인터페이스
@FunctionalInterface
interface StringEx1{
	String showInfo(String str);
}
@FunctionalInterface
interface StringEx2{
	int showInfo(String str);
}
@FunctionalInterface
interface StringEx3{
	int showInfo(String str,int index);
}
@FunctionalInterface
interface StringEx4{
	String showInfo(String str,int startIndex,int endIndex);
}
interface SimpleCal{
	int calc(int first,int second);
}
interface SimpleCal2{
	double calc(double first,double second);
}
public class LamdaRun {
	public static void main(String[] args) {
		//익명인너클래스
		//파라미터의 길이, 맨 앞자리 글자만 반환
		StringEx1 se1 = new StringEx1() {
			@Override
			public String showInfo(String str) {
				return str.length()+" "+str.substring(0,1);
			}
		};			
		System.out.println(se1.showInfo("안녕하세요"));//5 안
		
		//람다식
		StringEx1 se2 = 
				(String str)->{
					return str.length()+" "+str.substring(0,1);
				};
		se2 = str -> str.length()+" "+str.charAt(0);
		System.out.println(se2.showInfo("너두 나두"));
		/*
		 * ()->{}
		 * ()->1
		 * ()->{return 1;}
		 * 
		 * (int x)->x+1
		 * (x)->x+1
		 * x->x+1
		 * 
		 * (int x,int y)->x+y
		 * (x,y)->x+y
		 * 
		 * (String str)->str.length()
		 * str->str.length()
		 * 
		 *  x->{return x;} 가능
		 *  x->return x 불가
		 *  x->x 가능
		 */
		SimpleCal cal1= new SimpleCal() {
			public int calc(int first, int second) {
				return first+second;
			};
		};
		SimpleCal cal2= new SimpleCal() {
			public int calc(int first, int second) {
				return first-second;
			};
		};
		System.out.println(cal1.calc(4, 2));
		System.out.println(cal2.calc(4, 2));
		
		SimpleCal cal3 = (first, second)->first+second;
		SimpleCal cal4 = (first, second)->first-second;
		System.out.println(cal3.calc(6, 3));
		System.out.println(cal4.calc(6, 3));
		SimpleCal2 cal5 = (first, second)->Math.pow(first, second);
		cal5 = Math::pow;
		System.out.println(">>>"+cal5.calc(2, 3));
		
		//참조타입으로 변환(::)
		//메서드 참조
		//클래스 이름::메서드이름 or 참조변수명::메서드이름
		StringEx2 se3 = str->str.length();
		se3 = String::length;
		StringEx3 se4 = (str,index)->str.charAt(index);
		se4 = String::charAt;
		StringEx4 se5 = (str,startIndex,endIndex)->
						str.substring(startIndex, endIndex);
		se5 = String::substring;
		String str = "참조타입의 사용법 익히기";
		System.out.println(se3.showInfo(str));
		System.out.println(se4.showInfo(str, 0));
		System.out.println(se5.showInfo(str, 0, 1));
		
		//생성자 참조
		//클래스명::new
		TempEx temp = a->new TempClass(a);
		temp = TempClass::new;
		temp.showInfo(1);
	}
}
@FunctionalInterface
interface TempEx{
	TempClass showInfo(int temp);
}
class TempClass{
	TempClass(int a){
		System.out.println("발생"+a);
	}
}













