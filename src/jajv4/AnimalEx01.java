package jajv4;


interface Animal{
	public abstract void sound();
}

class Dog implements Animal {
	//ctrl+space �� ���ܿü�����
	//override�� �ǹ̴� �θ𲨸� ��ȿȭ��Ű�� �ڱⲬ ������.
	@Override 
	public void sound() {
		System.out.println("��");
	}
}

class Cat implements Animal{
	public void sound() {
		System.out.println("�ֿ�");
		
	}
}

class Bird implements Animal{
	public void sound() {
		System.out.println("±");
		
	}
}

class Tiger implements Animal{
	public void sound() {
		System.out.println("����");
		
	}
}

class Cow implements Animal{
	public void sound() {
		System.out.println("����");
		
	}
}

class Pig implements Animal{

	@Override
	public void sound() {
		System.out.println("��");
	}
	
}

public class AnimalEx01 {

	static void play(Animal b) {
		b.sound();
	}
	
	public static void main(String[] args) {
		
		Bird b1 = new Bird();
		play(b1);
		
		Cat c1 = new Cat();
		play(c1);

		play(new Dog());
		
		play(new Tiger());
		
		play(new Cow());
		
		play(new Pig());
	}

}
