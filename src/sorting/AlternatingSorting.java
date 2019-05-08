package sorting;

import java.util.Arrays;

public class AlternatingSorting {
	static void print_sorted_values(int arr[]) {
		int start = 0, end = arr.length - 1;
		while (start < end) {
			System.out.println(arr[end]);
			System.out.println(arr[start]);
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 6, 9, 4, 3, 7, 8, 2 };
		Arrays.sort(arr);
		print_sorted_values(arr);
	}
}
