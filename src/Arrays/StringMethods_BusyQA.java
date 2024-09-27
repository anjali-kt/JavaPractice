package Arrays;

public class StringMethods_BusyQA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "Welcome to Selenium java training";
		String s1[] = s.split(" ");
		System.out.println(s1.length);
		
		System.out.println(s.toUpperCase());
		
		System.out.println(s.toLowerCase());
		
		System.out.println(s.contains("Selenium"));
		
		int x = s1.length;
		int y = x-1;
		for(int i=y;i>=0;i--) {
			System.out.print(s1[i]+" ");
		}
		System.out.println();
		
		System.out.println(s.substring(5,8));
		
		
		
	}

}
