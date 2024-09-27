package oops;

public class MethodTakesNoParameter {
	
	int a;
	int b;
	
	void sum() {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodTakesNoParameter cal = new MethodTakesNoParameter();
		cal.a=100;
		cal.b=200;
		cal.sum();

	}

}
