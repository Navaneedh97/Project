package javaProgram;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1,2,3,4,5,6,7,8,9,10 };

        reverseArray(arr);

        System.out.println("Reversed Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

	}

}
