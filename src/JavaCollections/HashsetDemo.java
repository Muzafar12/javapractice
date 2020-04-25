package JavaCollections;

import java.util.HashSet;

public class HashsetDemo {
public static void main(String[] args) {
	HashSet<String> set = new HashSet<String>();
	HashSet<String> set1 = new HashSet<String>();
	
	set.add("blue");
	set.add("Red");
	set.add("blue");
	set.add("Orange");
	
	set1.add("Yellow");
	set1.add("Green");
	
	System.out.println(set.size());
	System.out.println(set.isEmpty());
	set1.addAll(set);

	for (String s : set1) {
		   System.out.println(s);
		  }

}
	
	
}
