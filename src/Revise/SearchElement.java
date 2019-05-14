package Revise;

public class SearchElement {
	static int find_element_by_Index(int arr[], int key) {
		int pivot = find_pivot(arr, 0, arr.length - 1);
		if (pivot == -1) {
			return perform_bs(arr, 0, arr.length - 1, key);
		}
		if (arr[pivot] == key) {
			return pivot;
		}
		if (arr[0] <= key) {
			return perform_bs(arr, 0, pivot - 1, key);
		}
		return perform_bs(arr, pivot + 1, arr.length - 1, key);
	}

	static int perform_bs(int arr[], int low, int high, int key) {
		if (low > high)
			return -1;
		int mid = (low + high) / 2;
		if (arr[mid] == key)
			return mid;
		if (arr[mid] > key)
			return perform_bs(arr, low, mid - 1, key);
		return perform_bs(arr, mid + 1, high, key);
	}

	static int find_pivot(int arr[], int low, int high) {
		if (low > high)
			return -1;
		int mid = (low + high) / 2;
		if (mid < high && arr[mid] > arr[mid + 1])
			return mid;
		if (low < mid && arr[mid] < arr[mid - 1]) {
			return mid - 1;
		}

		if (arr[low] > arr[mid])
			return find_pivot(arr, low, mid - 1);
		return find_pivot(arr, mid + 1, high);
	}

	public static void main(String[] args) {
		int arr[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
		int key = 3;
		int index = find_element_by_Index(arr, key);
		if (index == -1) {
			System.out.println("Element Not found");
			return;
		}
		System.out.println("Element found @ " + index);

	}
}
