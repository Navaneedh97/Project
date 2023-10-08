package javaProgram;

public class SeparateZerofromNonZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = { 0, 2, 0, 4, 0, 6, 7, 0, 9 ,8,0,24,0,0,45,0,0};

	        separateZerosAndNonZeros(arr);

	        System.out.println("Array after Separating Zero and Non-Zero: ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }

	    static void separateZerosAndNonZeros(int[] arr) {
	        int nonZeroIndex = 0;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] != 0) {
	                int temp = arr[i];
	                arr[i] = arr[nonZeroIndex];
	                arr[nonZeroIndex] = temp;
	                nonZeroIndex++;
	            }
	        }

	}

}
