package JavaCollections;

import java.util.LinkedList;

public class LinkedlistDemo {
	public static void main(String[] args) {
		LinkedList<String> linkedlist = new LinkedList<String>();
		
		linkedlist.add("F");
		linkedlist.add("B");
		linkedlist.add("D");
		linkedlist.add("E");
		linkedlist.add("C");
		linkedlist.addLast("Z");
		linkedlist.addFirst("A");
		linkedlist.add(1, "A2");
		System.out.println("Original cotents of linkedlist" + linkedlist);
		
		linkedlist.remove("F");
		linkedlist.remove(2);
		System.out.println("cotents of linkedlist after remove" + linkedlist);
		
		linkedlist.removeFirst();
		linkedlist.removeLast();
		System.out.println("cotents of linkedlist after remove first and last" + linkedlist);
		
		Object val = linkedlist.get(2);
		linkedlist.set(2, (String)val);
		
	}
	

}
