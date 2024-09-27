package Inheritance;

class test1{
	int a;
	int b;
	public void display() {
		System.out.println(a+b);
	}
}

class test2 extends test1{
	int x;
	int y;
	public void show() {
	System.out.println(x+y);
	}
	
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test2 obj = new test2();
		obj.a = 100;
		obj.b = 200;
		obj.display();
		
		//a,b and display() are the variables and method of class A. Due to inheritance we are able to access them
		//using class B object.
		
		

	}

}
