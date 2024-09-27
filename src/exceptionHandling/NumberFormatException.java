package exceptionHandling;

public class NumberFormatException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program started");
		String s = "abc";
		try {
			int i = Integer.parseInt(s);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		

	}

}
