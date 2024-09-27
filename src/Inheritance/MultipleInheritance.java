package Inheritance;

interface One{
	int a = 10;
	void display();
}

interface Two{
	int b = 20;
	void show();
}

public class MultipleInheritance implements One,Two {
	public void display() {
		System.out.println(a);
	}
	public void show() {
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritance miobj = new MultipleInheritance();
		miobj.display();
		miobj.show();

	}

}
