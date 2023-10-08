package javaProgram;
import java.util.Scanner;
public class CountOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;  
		int i, len;  
		int counter[] = new int[256];  
		Scanner input = new Scanner(System.in);  
		System.out.print("Please Enter String: ");    
		str = input.nextLine();  
		len = str.length();  
		for (i = 0; i < len; i++)   
		{  
		counter[(int) str.charAt(i)]++;  
		}  
		for (i = 0; i < 256; i++)   
		{  
		if (counter[i] != 0)   
		{       
		System.out.println((char) i + " --> " + counter[i]);  
		}  
		}

	}

}
