package oops;

public class StaticExample {
	
	int a;
	static int b;
	
	static void m1() {
		System.out.println("This is the static method");
	}
	
	void m2() {
		a = 800; //non static method can access static variables and static methods
		System.out.println("This is non static method");
	}
	
	void m3() { //non static method
		a = 500;
		StaticExample.b = 300; //non static methods can access static variables and static methods
		m1(); //non static method accessing static method
		m2();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b = 100;
		System.out.println(b);
		m1();
		StaticExample se = new StaticExample();
		se.a = 200;
		System.out.println(se.a);
		se.m2();
		se.m3();

	}

}
