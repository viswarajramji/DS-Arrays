package sorting;

import java.util.Arrays;

public class SortArray1toN {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 2, 5 };
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		System.out.println(Arrays.toString(arr));

	}
}
