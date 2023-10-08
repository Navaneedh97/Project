package javaProgram;

public class DuplicateArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,7,8,9,0,3,2,8,9,0,6 };

	    System.out.println("Duplicate elements in array:");
	    
	    
	    for (int i = 0; i < arr.length - 1; i++) {
	        for (int j = i + 1; j < arr.length; j++) {
	            if (arr[i] == arr[j]) {
	                System.out.println(arr[i]);
	            }
	        }
	}

	}

}
