package rotations;

public class MinValue {
	static void find_min_val(int arr[], int n) {
		int index = find_pivot_element(arr, 0, n);
		if (index == -1) {
			System.out.println("not found");
			return;
		}
		System.out.println("Element found " + arr[index]);
	}

	static int find_pivot_element(int arr[], int low, int high) {
		if (high < low)
			return -1;
		if (high == low)
			return low;
		int mid = (high + low) / 2;
		if (mid < high && arr[mid] > arr[mid + 1])
			return mid;
		if (low < mid && arr[mid] < arr[mid - 1])
			return mid - 1;
		if (arr[low] > arr[mid])
			return find_pivot_element(arr, low, mid - 1);
		return find_pivot_element(arr, mid + 1, high);

	}

	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 6, 2 };
		int n = arr.length - 1;
		find_min_val(arr, n);
	}
}
