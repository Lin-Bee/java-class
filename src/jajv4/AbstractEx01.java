package jajv4;

//�߻�Ŭ������ new�� �� ����.
//�߻�Ŭ������ ��ü�� �ִ� �޼���� ���� �޼��带 ���� �� �ִ�.
interface Į{
	public abstract void ų();
	public abstract void �丮();
	public abstract void �˹�();
	public abstract void ����();
}

abstract class �丮����� implements Į{

	@Override
	public void ų() {
		System.out.println("�ΰ��丮��ſ�");
		
	}

	@Override
	public void �˹�() {
		System.out.println("�˹���ſ�");
		
	}

	@Override
	public void ����() {
		System.out.println("�ΰ�������ſ�");
		
	}
	
	public void order() {
		����();
		�˹�();
		ų();
	}
	
}

class ������ extends �丮�����{

	
	@Override
	public void �丮() {
		System.out.println("�丮��ſ�");
		
	}
	
}

public class AbstractEx01 {

	public static void main(String[] args) {
		
		������ b = new ������();
		System.out.println(b.�丮());
		
	}

}
