package Revise;

import java.util.Arrays;

public class Swap_values {
	public static void main(String[] args) {
		int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		int i = -1;
		int j = 0;
		while (j < arr.length) {
			if (arr[j] < 0) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			j++;
		}
		System.out.println(Arrays.toString(arr));
	}
}
