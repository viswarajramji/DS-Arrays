package importants;

import java.util.Arrays;

public class ArrayKthSmallest {
	private static int find_median(int arr[], int i, int n) {
		if (i <= n)
			Arrays.sort(arr, i, n);
		else
			Arrays.sort(arr, n, i);
		return arr[n / 2];
	}

	private static int find_kth_smallest(int arr[], int l, int r, int k) {
		if (k > 0 && k <= r - l + 1) {
			int n = r - l + 1;
			int i;
			int med[] = new int[(n + 4) / 5];
			for (i = 0; i < n / 5; i++) {
				med[i] = find_median(arr, l + i * 5, 5);
			}
			if (i * 5 < n) {
				med[i] = find_median(arr, l + i * 5, n % 5);
				i++;
			}

			int medOfMed = (i == 1) ? med[i - 1] : find_kth_smallest(arr, 0, i - 1, i / 2);
			int pos = get_index_values(arr, l, r, medOfMed);
			if (pos - 1 == k - 1)
				return arr[pos];
			if (pos - 1 > k - 1)
				return find_kth_smallest(arr, l, pos - 1, k);
			return find_kth_smallest(arr, pos + 1, r, k - pos - 1 + l);
		}
		return Integer.MAX_VALUE;
	}

	static int[] swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}

	public static int get_index_values(int arr[], int l, int r, int x) {
		int i = 0;
		for (i = l; i < r; i++) {
			if (arr[i] == x) {
				break;
			}
		}

		swap(arr, i, r);
		
		i = l;
		for (int j = l; j <= r-1; j++) {
			if (arr[j] <= x) {
				swap(arr, i, j);
				i++;
			}
		}
		swap(arr, i, r);
		return i;
	}

	public static void main(String[] args) {
		int arr[] = {12, 3, 5, 7, 4, 19, 26}; 
		int n = arr.length;
		int k = 3;
		int index = find_kth_smallest(arr, 0, n-1, k);
		System.out.println(index);
	}
}
