package Revise;

import java.util.Arrays;

public class SwapValues {
	public static void main(String[] args) {
		int arr[] = new int[] { 50, 40, 70, 60, 90 };
		int index[] = new int[] { 3, 0, 4, 1, 2 };
		for (int i = 0; i < arr.length; i++) {
			while (index[i] != i) {
				int inx = index[index[i]];
				int val = arr[index[i]];

				index[index[i]] = index[i];
				arr[index[i]] = arr[i];

				index[i] = inx;
				arr[index[i]] = val;
			}
		}
		
		System.out.println(Arrays.toString(index));
		System.out.println(Arrays.toString(arr));
		

	}
}
