package javaProgram;
import java.util.Arrays;
public class EqualitytoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] aaa = {"Navanee", "makizh", "arun", "vino"};
        String[] bbb = {"Navanee", "josh", "arun", "jack"};
         String[] ccc = {"Navanee", "makizh", "arun", "vino"};
 
        System.out.println(Arrays.equals(aaa, bbb));        
 
        System.out.println(Arrays.equals(aaa, ccc));     

	}

}
