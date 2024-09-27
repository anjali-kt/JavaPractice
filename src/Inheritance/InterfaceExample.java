package Inheritance;

interface Testinter{
	int a = 10;
	void display(); 
}


public class InterfaceExample implements Testinter {
	public void display() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample ieobj = new InterfaceExample();
		ieobj.display();

	}

}
