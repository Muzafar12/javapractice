package JavaCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo2 {
public static void main(String[] args) {
	

	Map<String, List<String>> map = new HashMap<String, List<String>>();
	
	List<String> valSetOne = new ArrayList<String>();
	valSetOne.add("Apple");
	valSetOne.add("Orange");
	
	List<String> valSetTwo = new ArrayList<String>();
	valSetTwo.add("Cat");
	valSetTwo.add("Dog");
	
	List<String> valSetThree = new ArrayList<String>();
	valSetThree.add("Car");
	valSetThree.add("Bike");
	
	map.put("A", valSetOne);
	map.put("B", valSetTwo);
	map.put("C", valSetThree);
	
	//System.out.println(map);
	
	for(Map.Entry<String, List<String>> entry : map.entrySet()) {
		String key = entry.getKey();
		List<String> value = entry.getValue();
		System.out.println(key + " " + value);
	}
}
}
