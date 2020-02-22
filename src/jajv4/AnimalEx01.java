package jajv4;


interface Animal{
	public abstract void sound();
}

class Dog implements Animal {
	//ctrl+space ·Î ¶¯°Ü¿Ã¼öÀÖÀ½
	//overrideÀÇ ÀÇ¹Ì´Â ºÎ¸ð²¨¸¦ ¹«È¿È­½ÃÅ°°í ÀÚ±â²¬ °­Á¶ÇÔ.
	@Override 
	public void sound() {
		System.out.println("¸Û");
	}
}

class Cat implements Animal{
	public void sound() {
		System.out.println("¾Ö¿Ë");
		
	}
}

class Bird implements Animal{
	public void sound() {
		System.out.println("Â±");
		
	}
}

class Tiger implements Animal{
	public void sound() {
		System.out.println("¾îÈï");
		
	}
}

class Cow implements Animal{
	public void sound() {
		System.out.println("À½¸Ó");
		
	}
}

class Pig implements Animal{

	@Override
	public void sound() {
		System.out.println("²Ü");
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
