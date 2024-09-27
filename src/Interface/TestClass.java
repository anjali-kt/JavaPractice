package Interface;

public class TestClass implements Test1,Test2{
	
	public void m1() {
		System.out.println(i);
	}
	
	public void m2() {
		System.out.println(j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Multiple Inheritance is accomplished through interface.
		//Test1 and Test2 are the parent interfaces
		//And TestClass is the child class that implements them
		
		Test1 obj1 = new TestClass();
		obj1.m1();
		TestClass obj2 = new TestClass();
		obj2.m2();

	}

}
