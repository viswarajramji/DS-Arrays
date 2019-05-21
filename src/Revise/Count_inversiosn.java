package Revise;

public class Count_inversiosn {
	public static void main(String[] args) {
		int arr[] = { 1, 20, 6, 4, 5 };
		int temp[] = new int[arr.length];
		System.out.println(compute_inversions(arr, temp, 0, arr.length - 1));

	}

	static int compute_inversions(int arr[], int temp[], int low, int high) {
		int inversion_cnt = 0;
		if (low < high) {
			int mid = (low + high) / 2;
			inversion_cnt = compute_inversions(arr, temp, low, mid);
			inversion_cnt += compute_inversions(arr, temp, mid + 1, high);
			inversion_cnt += merge_values(arr, temp, low, mid+1, high);
		}
		return inversion_cnt;
	}

	static int merge_values(int arr[], int temp[], int low, int mid, int high) {
		int i = low;
		int k = mid;
		int index = low;
		int inv_cnt = 0;
		while (i <= mid - 1 && k <= high) {
			if (arr[i] <= arr[k]) {
				temp[index++] = arr[i++];
			} else {
				temp[index++] = arr[k++];
				inv_cnt += (mid - i);
			}
		}

		for (int f = i; f <= mid - 1; f++) {
			temp[index++] = arr[f];
		}

		for (int f = k; f <= high; f++) {
			temp[index++] = arr[f];
		}
		for (i = low; i <= high; i++) {
			arr[i] = temp[i];
		}
		return inv_cnt;

	}
}
