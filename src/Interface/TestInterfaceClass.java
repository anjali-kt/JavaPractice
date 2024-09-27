package Interface;

public class TestInterfaceClass implements TestInterface{
	
	public void m1() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterfaceClass obj = new TestInterfaceClass();
		obj.m1();

	}

}
