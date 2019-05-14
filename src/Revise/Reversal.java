package Revise;

import java.util.Arrays;

public class Reversal {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int l = 0;
		int r = arr.length - 1;
		while (l < r) {
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
		System.out.println(Arrays.toString(arr));
	}

}
