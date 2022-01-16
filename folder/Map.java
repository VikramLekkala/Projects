package PracticeProject1;

import java.util.HashMap;

public class Map {
	public static void main(String[] args) {
	
	HashMap<Integer,String> h=new HashMap<Integer, String>();
	h.put(1, "imran");
	h.put(2, "armaan");
	h.put(3, "arijit");
	h.put(4, "shreya");
	h.put(5, "armaan");
	h.put(7, "arijit");
	h.put(6, "armaan");
	h.put(8, "arijit");
	h.put(2,"amrita");
	h.put(null, "Nikita");
	h.put(2, "Bhargav");
	
	
	System.out.println("Size of map "+h.size());
	System.out.println("printing the contents");
	for(Integer key:h.keySet()){
		String name=h.get(key);
		System.out.println(key+ " "+name);
	}
}

}


