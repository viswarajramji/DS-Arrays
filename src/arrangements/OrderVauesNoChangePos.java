package arrangements;

import java.util.Arrays;

public class OrderVauesNoChangePos {
	static void rearrange(int arr[], int l, int r) {
		if (l < r) {
			int mid = (l + r) / 2;
			rearrange(arr, l, mid);
			rearrange(arr, mid + 1, r);
			compute_values(arr, l, mid, r);
		}
	}

	static void compute_values(int arr[], int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		int L1[] = new int[n1];
		int R1[] = new int[n2];
		for (int i = 0; i < n1; i++) {
			L1[i] = arr[i + l];
		}

		for (int i = 0; i < n2; i++) {
			R1[i] = arr[m + i + 1];
		}

		int i = 0;
		int j = 0;
		int k = l;

		while (i < n1 && L1[i] < 0) {
			arr[k++] = L1[i++];
		}

		while (j < n2 && R1[j] < 0) {
			arr[k++] = R1[j++];
		}

		while (i < n1) {
			arr[k++] = L1[i++];
		}

		while (j < n2) {
			arr[k++] = R1[j++];
		}

		return;

	}

	public static void main(String[] args) {
		int arr[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 }; 
		rearrange(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
}
