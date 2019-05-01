package order_statics;

import java.util.Arrays;

public class KthSmall {
	public static void main(String[] args) {
		Integer arr[] = { 6, 4, 2, 9 };
		int k = 10;
		if (k >= arr.length) {
			System.out.println("Out of Range");
			return;
		}
		Arrays.sort(arr);
		System.out.println(arr[k-1]);

	}
}
