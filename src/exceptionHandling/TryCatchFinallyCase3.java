package exceptionHandling;

public class TryCatchFinallyCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//no exception - catch block will ignore - finally execute
		int a[] = new int[4];
		try {
			a[3] = 10;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("This is finally block");
		}


	}

}
