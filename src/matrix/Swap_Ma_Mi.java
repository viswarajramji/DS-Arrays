package matrix;

import java.util.Arrays;


public class Swap_Ma_Mi {
	public static void main(String[] args) {
		int arr[][] = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };
		for (int i = 0; i < arr.length; i++) {
			process_values(arr[i]);
		}
		System.out.println(Arrays.deepToString(arr));
	}

	static void process_values(int arr[]) {
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = i;
			}
			if (min > arr[i]) {
				min = i;
			}
		}

		if (min == max) {
			return;
		}
		int temp = arr[min];
		arr[min] = arr[max];
		arr[max] = temp;
		return;
	}
}
