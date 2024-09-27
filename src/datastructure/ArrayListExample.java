package datastructure;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> list = new ArrayList <String>();
		list.add("Anjali");
		list.add("Aarin");
		list.add("Priyan");
		System.out.println(list.size());
		
		for(String s:list) {
			System.out.println(s);
		}

	}

}
