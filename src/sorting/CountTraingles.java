package sorting;

import java.util.Arrays;

public class CountTraingles {

	static void count_no_of_traingles(int arr[]) {
		int n = arr.length;
		Arrays.sort(arr);
		int counter = 0;
		for (int i = 0; i < n - 2; ++i) {
			int k = i + 2;
			for (int j = i + 1; j < n; j++) {
				while (k < n && arr[i] + arr[j] > arr[k]) {
					k++;
				}
				if (k > j)
					counter += k - j - 1;
			}
		}
		System.out.println(counter);
	}

	public static void main(String[] args) {
		int arr[] = {4, 6, 3, 7};
		count_no_of_traingles(arr);
	}
}
