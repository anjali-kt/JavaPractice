package Inheritance;

class A{
	int a;
	int b;
	public void display() {
		System.out.println(a+b);
		}
}

class B{
	int x;
	int y;
	public void show() {
		System.out.println(x+y);
	}
}

public class Example_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aobj = new A();
		aobj.a = 10;
		aobj.b = 20;
		aobj.display();
		
		B bobj = new B();
		bobj.x = 30;
		bobj.y = 40;
		bobj.show();

	}

}
