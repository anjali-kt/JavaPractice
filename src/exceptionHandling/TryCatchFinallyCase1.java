package exceptionHandling;

public class TryCatchFinallyCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exception occurs - catch block handles - finally also executes
		int a[] = new int[4];
		try {
			a[4] = 10;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("This is finally block");
		}

	}

}
