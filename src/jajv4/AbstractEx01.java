package jajv4;

//추상클래스는 new할 수 없다.
//추상클래스는 몸체가 있는 메서드와 없는 메서드를 만들 수 있다.
interface 칼{
	public abstract void 킬();
	public abstract void 요리();
	public abstract void 검무();
	public abstract void 조각();
}

abstract class 요리어댑터 implements 칼{

	@Override
	public void 킬() {
		System.out.println("인간요리즐거워");
		
	}

	@Override
	public void 검무() {
		System.out.println("검무즐거워");
		
	}

	@Override
	public void 조각() {
		System.out.println("인간조각즐거워");
		
	}
	
	public void order() {
		조각();
		검무();
		킬();
	}
	
}

class 백종원 extends 요리어댑터{

	
	@Override
	public void 요리() {
		System.out.println("요리즐거워");
		
	}
	
}

public class AbstractEx01 {

	public static void main(String[] args) {
		
		백종원 b = new 백종원();
		System.out.println(b.요리());
		
	}

}
