package exceptionHandling;

public class ArrayIndexOutOfBoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program started");
		int a[] = new int[5];
		try {
			a[5] = 10;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Program ended");

	}

}
