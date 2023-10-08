package javaProgram;

import java.util.Arrays;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {  27, 5, 3, 80, 7, 9, 12 };
        int requiredSum = 95;
        findSubArray(arr, requiredSum);
    }
    static void findSubArray(int[] arr, int requiredSum) 
    {
        int sum = arr[0], start = 0;
        for (int i = 1; i < arr.length; i++) 
        {
            if (sum == requiredSum) {
                System.out.print("Continuous Sub Aarray of " + Arrays.toString(arr) + " whose sum "
                        + requiredSum + " is [ ");
                for (int j = start; j < i; j++) 
                {
                    System.out.print(arr[j] + " ");
                }
                System.out.println("]");
            }
            sum = sum + arr[i];
            while (sum > requiredSum && start <= i - 1) 
            {
                sum = sum - arr[start];
                start++;
            }
        }

	}

}
