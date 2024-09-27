package datastructure;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer,String> hm = new HashMap <Integer, String>();
		hm.put(100, "Anjali");
		hm.put(200, "Aarin");
		hm.put(300, "Priyan");
		System.out.println(hm);
		
		for(Map.Entry m: hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
				
		}
		hm.remove(100);
		System.out.println(hm);

	}

}
