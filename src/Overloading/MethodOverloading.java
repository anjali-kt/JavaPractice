package Overloading;

public class MethodOverloading {
	
	int a;
	int b;
	
	void sum() {  //first method
		a = 10;
		b = 20;
		System.out.println(a+b);
	}
	
	void sum(int x,int y) {  //Second method
		a = x;
		b = y;
		System.out.println(a+b);
	}
	
	void sum(int x,int y,int z) {  //Third method
		System.out.println(x+y+z);
	}
	
	void sum(int x,double d) {  //Fourth method
		System.out.println(x+d);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj = new MethodOverloading();
		obj.sum(); //calls first method
		obj.sum(10,20); //calls second method
		obj.sum(100,200,300); //calls third method
		obj.sum(100,10.5); //calls fourth method

	}

}
