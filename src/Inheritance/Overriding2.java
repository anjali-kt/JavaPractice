package Inheritance;

class vehicle{
	void run() {
		System.out.println("vehicle is running");
	}
}

class bike extends vehicle{
	void run() {
		System.out.println("Bike is running");
	}
}

public class Overriding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehicle vobj = new vehicle();
		vobj.run();
		bike bobj = new bike();
		bobj.run();

	}

}
