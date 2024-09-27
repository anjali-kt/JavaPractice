package exceptionHandling;

public class InterruptedExceptionThrowsKeyword {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Program started");
		System.out.println("Program is in progress");
		Thread.sleep(4000);
		System.out.println("Program completed");
		System.out.println("Program exited");


	}

}
