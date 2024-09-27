package exceptionHandling;

public class NullPointerException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Pgm started");
		String s = null;
		try {
			System.out.println(s.length());
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Program ended");

	}

}
