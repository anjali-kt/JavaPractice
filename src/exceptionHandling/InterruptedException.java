package exceptionHandling;

public class InterruptedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program started");
		System.out.println("Program is in progress");
		try {
			Thread.sleep(3000);
		} catch (java.lang.InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Program completed");
		System.out.println("Program exited");

	}

}
