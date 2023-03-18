package study13;

//인터페이스
interface Material{
	//추상메소드
	public abstract void doPrinting();
}
//일반클래스 인터페이스를 구현
class Powder extends Object implements Material{
	//부모클래스 메서드 오버라이딩
	@Override
	public String toString() {
		return "사용물질:파우더";
	}
	//인터페이스의 추상메서드 오버라이딩
	@Override
	public void doPrinting() {
		System.out.println("파우더 제품 제작중...");
	}
}
class Plastic implements Material{
	@Override
	public String toString() {
		return "사용물질:플라스틱";
	}
	@Override
	public void doPrinting() {
		System.out.println("플라스틱 제품 제작중...");
	}
}
//제너릭 클래스
class Print3D<T extends Material>{
	//필드
	private T material;
	//getter setter
	public T getMaterial() {
		return material;
	}
	public void setMaterial(T material) {
		this.material = material;
	}
	@Override
	public String toString() {
		return material.toString();
	}
	public void printing() {
		material.doPrinting();
	}
}
public class Printer3DRun {
	public static void main(String[] args) {
		Print3D<Powder> pPo = new Print3D<>();
		pPo.setMaterial(new Powder());
		System.out.println(pPo.toString());
		pPo.printing();
		
		Print3D<Plastic> pPl = new Print3D<>();
		pPl.setMaterial(new Plastic());
		System.out.println(pPl.toString());
		pPl.printing();
		
		Print3D<Material> pMa = new Print3D<>();
		pMa.setMaterial(new Powder());
		System.out.println(pMa.toString());
		pMa.printing();
		pMa.setMaterial(new Plastic());
		System.out.println(pMa.toString());
		pMa.printing();

	}
}



