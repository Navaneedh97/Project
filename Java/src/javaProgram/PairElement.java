package javaProgram;

public class PairElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 4, 3, 5, 7, 8, 9 };
        int targetSum = 9;

        System.out.println("Pair with sum " + targetSum + ":");
        findPairsWithSum(arr, targetSum);
    }

    static void findPairsWithSum(int[] arr, int targetSum) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + targetSum);
                }
            }
        }

	}

}
