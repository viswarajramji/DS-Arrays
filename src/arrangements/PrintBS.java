package arrangements;

import java.util.Arrays;

public class PrintBS {
	static void process_values(int arr[]) {
		int n = arr.length - 1;
		int temp[] = new int[arr.length];
		int arr_len = 0;
		for (int i = 0, j = n; i <= n / 2 || j > n / 2; i++, j--) {
			if (arr_len < n+1) {
				temp[arr_len] = arr[i];
				arr_len++;
			}
			if (arr_len < n+1) {
				temp[arr_len] = arr[j];
				arr_len++;
			}
		}
		System.out.println(Arrays.toString(temp));
	}

	public static void main(String[] args) {
		int arr[] = { 4, 2, 1, 5 };
		Arrays.sort(arr);
		process_values(arr);
	}
}
