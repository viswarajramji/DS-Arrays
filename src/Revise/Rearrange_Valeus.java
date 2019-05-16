package Revise;

import java.util.Arrays;

public class Rearrange_Valeus {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int n = arr.length;
		int max_val = arr[arr.length - 1];
		int min_val = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				arr[i] = max_val;
				max_val--;
			} else {
				arr[i]=min_val;
				min_val++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
