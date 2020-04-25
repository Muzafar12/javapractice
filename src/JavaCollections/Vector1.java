package JavaCollections;

import java.util.Iterator;
import java.util.Vector;

public class Vector1 {

	public String generateLoc(String calcinput, int rowcount) {
		String calcLoc = ".calcu-block div input[id=" + calcinput+ "]";
		String calcxpath = "//*[@id='calc']/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[1]/div[1]/div[" + rowcount +"]";
		System.out.println("css is " + calcLoc);
		System.out.println("xpath is " + calcxpath);
		return calcLoc;
		
	}
	public static void main(String[] args) {
		Vector1 loc = new Vector1();
		loc.generateLoc("homeval",4);
	
		
	}
	
	

}
