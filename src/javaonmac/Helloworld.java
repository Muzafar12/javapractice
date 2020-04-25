package javaonmac;

//import com.sun.tools.javac.util.List;

public class Helloworld {
	public static void main(String[] args) {
		Helloworld hw = new Helloworld();
		
		System.out.println("Hello World!!");
				
		
		for(int i = 10; i > 1; i--) {
			System.out.println(i);
			hw.myMethod();
		}
	}
	
	public void myMethod() {
		System.out.println("This is a print methodd");
		System.out.println("This is a print methodd");
		System.out.println("This is a print methodd");
		System.out.println("This is a print methodd");
		System.out.println("This is a print methodd");
	}
}
