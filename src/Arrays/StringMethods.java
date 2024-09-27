package Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Welcome";
		System.out.println(s1.length());
		
		String s2 = "Canada";
		System.out.println(s1+" "+s2);
		System.out.println(s1.concat(" "+s2));
		System.out.println("Welcome"+" "+"Canada");
		System.out.println("Welcome".concat(" "+"Canada"));
		
		String s3 = "WELCOME";
		String s4 = "welcome";
		System.out.println(s3.equals(s4));
		
		System.out.println(s3.equalsIgnoreCase(s4));
		
		System.out.println(s3.contains("WEL"));
		System.out.println(s3.contains("ABC"));
		
		System.out.println(s1.substring(0, 3));
		System.out.println(s1.substring(2, 5));
		System.out.println(s1.substring(4, 7));
		
		System.out.println(s1.replace('e', 'a'));
		System.out.println(s1.replace("come", "Kame"));

	}

}
