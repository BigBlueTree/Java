package study13;

public class UtilBox {//일반 클래스
	//제너릭 메서드
	public <T> T boxing(T t) {
		return t;
	}
	public <T> boolean boxing(T t1,T t2) {
		return t1.equals(t2);
	}
	public <K,V> void boxing2(K k,V v) {
		System.out.println(k+":"+v);
	}
	//일반적인 제너릭 조건에서는 Object 메서드만 사용가능
	//사용가능한 제너릭 조건으로 변경하면 해당 메서드도 사용가능
	public <T extends String> void boxing3(T t) {
		System.out.println(t.length());
	}
}






