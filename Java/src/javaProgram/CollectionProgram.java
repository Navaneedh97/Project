package javaProgram;
import java.util.ArrayList;
public class CollectionProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> fruits=new ArrayList<String>();
	    fruits.add("Apple");
	    fruits.add("Orange");
	    fruits.add("Banana");
	    fruits.add("Grapes");
	    fruits.add("Mango");
	    fruits.add("Watermelon");
	    fruits.add("Pomegranate");
	    System.out.println(fruits);
	    
	    System.out.println(fruits.get(2));
	    
	    fruits.set(2,"Jackfruit");
	    System.out.println(fruits);
	    
	    fruits.remove(3);
	    System.out.println(fruits);
	    
	    System.out.println(fruits.size());
	    

	}

}
