package Inheritance;

class Test3{
	int a;
	int b;
	public void display() {
		System.out.println(a+b);
	}
}

class Test4 extends Test3{
	int x;
	int y;
	public void show() {
	System.out.println(x+y);
	}
	
}

class Test5 extends Test4{
	int p;
	int q;
	public void addition() {
		System.out.println(p+q);
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test5 obj = new Test5();
		obj.a = 100;
		obj.b = 200;
		obj.p = 300;
		obj.q = 400;
		obj.x = 500;
		obj.y = 600;
		obj.display();
		obj.show();
		obj.addition();
	}

}
