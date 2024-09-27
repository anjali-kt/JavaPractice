package Overloading;

public class ConstructorOverloading {
	
	int a;
	int b;
	double c;
	
	ConstructorOverloading(){
		a = 10;
		b = 20;
		c = 20.5;
	}
	
	ConstructorOverloading(int x, int y){
		a = x;
		b = y;
	}
	
	ConstructorOverloading(int x,double d){
		a = x;
		c = d;
	}
	
	ConstructorOverloading(int x,int y,double z){
		a = x;
		b = y;
		c = z;
	}
	
	ConstructorOverloading(int x,double z,int y){
		a = x;
		b = y;
		c = z;
	}
	
	void display() {
		System.out.print(a);
		System.out.print(" "+b);
		System.out.print(" "+c);
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading obj1 = new ConstructorOverloading();
		obj1.display();
		ConstructorOverloading obj2 = new ConstructorOverloading(10,20);
		obj2.display();
		ConstructorOverloading obj3 = new ConstructorOverloading(10,20.5);
		obj3.display();
		ConstructorOverloading obj4 = new ConstructorOverloading(10,20,20.5);
		obj4.display();
		ConstructorOverloading obj5 = new ConstructorOverloading(10,20.5,20);
		obj5.display();

	}

}
