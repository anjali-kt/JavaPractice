package datastructure;

import java.util.ArrayList;

public class ArrayListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add("Welcome");
		al.add(10);
		al.add(10.456);
		al.add('C');
		System.out.println(al);
		System.out.println(al.size());
		
		al.add(2, "Anjali");
		al.add(1, 1234);
		System.out.println(al.size());
		System.out.println(al);
		
		al.remove("Anjali");
		al.remove(1);
		System.out.println(al);
		
		

	}

}
