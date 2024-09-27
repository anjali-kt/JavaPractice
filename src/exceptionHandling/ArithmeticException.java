package exceptionHandling;

public class ArithmeticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program started");
		int a =10;
		try {
			System.out.println(a/0);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Program in progress");
		System.out.println("Program completed");

	}

}
