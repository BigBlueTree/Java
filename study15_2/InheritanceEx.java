package study15_2;

class Bicycle{
	String define() { return "패달을 가진 교통수단"; }
}
class Motorcycle extends Bicycle{
	String define() { return "엔진을 가진 자전거"; }
	Motorcycle(){
		System.out.println("나는 모터사이클입니다. 나는 "+define());
		String temp = super.define();
		System.out.println("내 부모는 "+temp+"인 자전거입니다.");
	}
}
public class InheritanceEx {
	public static void main(String[] args) {
		Motorcycle m = new Motorcycle();
		/*
		 	나는 모터사이클입니다. 나는 엔진을 가진 자전거
			내 부모는 패달을 가진 교통수단인 자전거입니다.
		 */
	}
}
