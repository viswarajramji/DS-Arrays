package arrangements;

import java.util.Arrays;

public class OrderingValues {
	static void process_values(int arr[]) {
		int i, j;
		int n = arr.length-1;
		Arrays.sort(arr);
		int temp[] = new int[arr.length];
		int arr_len = 0;
		for (i = 0, j = n; i <= n / 2 || j > n / 2; i++, j--) {
			if (arr_len < n) {
				temp[arr_len] = arr[i];
				arr_len++;
			}
			if (arr_len < n) {
				temp[arr_len] = arr[j];
				arr_len++;
			}
		}
		System.out.println(Arrays.toString(temp));

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		process_values(arr);
	}
}
