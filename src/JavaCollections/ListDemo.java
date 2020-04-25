package JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("toyota");
		list.add("BMW");
		list.add("JEEP");
		System.out.println(list);
		
		//list.remove(0);
		//System.out.println(list);
		
		list.set(0, "TOYOTA");
		System.out.println(list);
		
		System.out.println(list.indexOf("BMW"));
		
		ArrayList<String> list_1 = new ArrayList();
		list_1.add("MINI");
		list_1.add("Lambo");
		
		list.addAll(list_1);
		
		System.out.println(list);
		
		list.removeAll(list_1);
		
		System.out.println(list);
		
		Iterator<String> itr=list.iterator();  

		  while(itr.hasNext()){  
		   System.out.println(itr.next());
		  }  
		  
		  for(String obj:list) { 
			     System.out.println(obj);  
		}  


	}

	
}
