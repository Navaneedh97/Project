package javaProgram;
import java.io.*;
public class Method {
	static int num =10;
	static String a="Navanee";
	static void display()
	{
		System.out.println("Static Number : " +num);
		System.out.println("Static String : " + a);
	
	}
	
	void nonstatic()
	{
		display();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method obj = new Method();
		obj.nonstatic();
		
		display();

		

	}

}
