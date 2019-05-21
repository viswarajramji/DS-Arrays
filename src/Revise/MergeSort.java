package Revise;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int arr[] = {4,2,5,6,1};
		int temp[] = new int[arr.length];
		perform_divide_conq(arr, temp, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	static void perform_divide_conq(int arr[], int temp[], int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			perform_divide_conq(arr, temp, low, mid);
			perform_divide_conq(arr, temp, mid + 1, high);
			merge_values(arr, temp, low, mid + 1, high);
		}
		return;
	}

	static void merge_values(int arr[], int temp[], int low, int mid, int high) {
		int i = low;
		int j = mid;
		int k = low;
		while (i <= mid - 1 && j <= high) {
			if (arr[i] <= arr[j]) {
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
			}
		}

		while (i <= mid - 1) {
			temp[k++] = arr[i++];
		}

		while (j <= high) {
			temp[k++] = arr[j++];
		}

		for (i = low; i <= high; i++) {
			arr[i] = temp[i];
		}
	}

}
