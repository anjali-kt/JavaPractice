package oops;

public class MethodReturnValue {
	int a;
	int b;
	
	int sum() {
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodReturnValue cal = new MethodReturnValue();
		cal.a=100;
		cal.b=200;
		int r= cal.sum();
		System.out.print(r);
		

	}

}
