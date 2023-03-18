package study12;

class Type3{
	static final String WALKING="워킹";
	static final String TRACKING="트랙킹";
	static final String HIKING="하이킹";
	static final String RUNNING="러닝";
}

enum Type{
	WALKING("워킹"), TRACKING("트랙킹"), 
	HIKING("하이킹"), RUNNING("러닝");
	
	final private String name;
	
	private Type(String name){
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
}

public class Shoes {
	public String name;
	public int size;
	public Type type;
//	public enum Type{
//		WALKING, TRACKING, HIKING, RUNNING	
//	}
	public static void main(String[] args) {
		Shoes shoes = new Shoes();
		shoes.name="아디다스";
		shoes.size=280;
		shoes.type=Type.WALKING;
		System.out.println(shoes.name);
		System.out.println(shoes.size);
		System.out.println(shoes.type);
		//values()
		for(Type type:Type.values()) {
			System.out.println(type);
		}
		//ordinal()
		System.out.println(shoes.type.ordinal());
		Type tp = Type.RUNNING;
		System.out.println(tp.ordinal());

		//valueOf()
		Type tpa = Type.TRACKING;
		Type tpb = Type.valueOf("WALKING");
		System.out.println(tpa);
		System.out.println(tpb);
		
		for(Type type:Type.values()) {
			System.out.println(type.getName());
		}
		
		String str = Type3.HIKING;
		System.out.println(str);
	}

}
