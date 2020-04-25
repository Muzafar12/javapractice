package JavaCollections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map =new HashMap<>();
		map.put(3, "Ali");
		map.put(4,"Aman");
		map.put(8, "Amir");
		
		for(Map.Entry<Integer, String> entry : map.entrySet()){
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " " + value);
		}
		
		System.out.println(map.size());
		System.out.println(map.get(8));
		if(map.containsKey(8)) {
			System.out.println("Map has a given key");
		}
		else {
			System.out.println("Map hasn't a given key");
		}
		
		map.clear();
		
		if (map.isEmpty()) {
			System.out.println("Map is Empty");
		}
		
	}
}
