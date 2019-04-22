package rotations;

/**
 * get the pivot index split the array into 2 segments by pivot elment if the
 * key is >0th element search the seg 1 else seg 2
 */
public class SearchSortedArray {
	static int findIndexArr(int arr[], int X) {
		int n = arr.length;
		int pivot = find_pivot_value(arr, 0, n - 1);
		System.out.println("pivot element:" + pivot);
		if (pivot == -1) {
			return getIndex(arr, 0, n - 1, X);
		}
		if (arr[pivot] == X)
			return pivot;

		if (arr[0] <= X)
			return getIndex(arr, 0, pivot - 1, X);
		return getIndex(arr, pivot + 1, n - 1, X);

	}

	static int getIndex(int arr[], int low, int high, int key) {
		if (high < low)
			return -1;
		int mid = (low + high) / 2;
		if (arr[mid] == key)
			return mid;
		if (key < arr[mid])
			return getIndex(arr, low, mid - 1, key);
		return getIndex(arr, mid + 1, high, key);
	}

	static int find_pivot_value(int arr[], int low, int high) {
		if (high < low) {
			return -1;
		}
		if (high == low) {
			return low;
		}

		int mid = (low + high) / 2;
		if (mid < high && arr[mid] > arr[mid + 1]) {
			return mid;
		}
		if (low < mid && arr[mid - 1] > arr[mid]) {
			return mid - 1;
		}
		if (arr[low] >= arr[mid]) {
			return find_pivot_value(arr, low, mid - 1);
		}
		return find_pivot_value(arr, mid + 1, high);

	}

	public static void main(String[] args) {
		int arr[] = { 4, 5, 6, 2, 3 };
		System.out.println("Index:" + findIndexArr(arr, 1));
	}
}
