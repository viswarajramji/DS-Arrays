package Revise;

public class SubArray {
	public static void main(String[] args) {
		int k = 3;
		int arr[] = { 3, 7, 90, 20, 10, 50, 40 };
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		int max_val = Integer.MAX_VALUE;
		int index = 0;
		for (int i = k; i < arr.length; i++) {
			sum += arr[i] - arr[i - k];
			if (max_val > sum) {
				max_val = sum;
				index = i;
			}
		}
		System.out.println("Max values=" + max_val + " index = " + index + " end_index=" + index + k);
	}
}
