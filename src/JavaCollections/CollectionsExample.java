package JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsExample {
	public static void main(String[] args) {
		Student s1 = new Student(101, "Mina", 18);
		Student s2 = new Student(102, "Aziza", 19);
		Student s3 = new Student(103, "Amir", 21);
		
		ArrayList<Student> studentlist = new ArrayList<Student>();
		studentlist.add(s1);
		studentlist.add(s2);
		studentlist.add(s3);
		
		Iterator itr = studentlist.iterator();
		
		while(itr.hasNext()) {
			Student st = (Student)itr.next();
			System.out.println(st.stID + " " + st.stName + " " + st.stAge);	
		}
		
		for(Student lidt:studentlist) {
			System.out.println(lidt.stAge);
		}
		
		for(Student st: studentlist) {
			System.out.println(st.stID + " " + st.stName + " "+ st.stAge);
	}
	}
	
}
