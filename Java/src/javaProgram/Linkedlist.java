package javaProgram;
import java.util.LinkedList;
public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> Numbers = new LinkedList<String>();
		Numbers.add("1");
		Numbers.add("2");
		Numbers.add("3");
		Numbers.add("4");
		Numbers.add("5");
		Numbers.add("6");
		Numbers.add("7");
		Numbers.add("8");
		Numbers.add("9");
		Numbers.add("10");
		
		System.out.println(Numbers);
		
		Numbers.remove("2");
		Numbers.remove("4");
		Numbers.remove("6");
		Numbers.remove("8");
		Numbers.remove("10");
  
		System.out.println(Numbers);
		
		Numbers.add(1, "2");
		System.out.println(Numbers);
		
	}

}
