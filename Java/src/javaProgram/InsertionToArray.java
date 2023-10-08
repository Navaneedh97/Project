package javaProgram;

public class InsertionToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {23, 36, 96, 78, 55, 99, 87};
	      int[] array2 = {78, 45, 19, 73, 55, 100, 87};
	      System.out.println("Intersection of Two Arrays :");
	     
	      for(int i = 0; i<array1.length; i++ ) {
	         for(int j = 0; j<array2.length; j++) {
	            if(array1[i]==array2[j]) {
	               System.out.println(array2[j]);
	            }
	         }
	      }

	}

}
