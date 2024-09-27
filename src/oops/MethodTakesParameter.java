package oops;

public class MethodTakesParameter {
	int a;
	int b;
	
	void sum(int x,int y) {
		a=x;
		b=y;
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodTakesParameter cal = new MethodTakesParameter();
		cal.sum(100, 200);

	}

}
