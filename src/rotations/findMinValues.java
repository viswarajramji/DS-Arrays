package rotations;

//O(log n)
public class findMinValues {
	static void process_rotations(int arr[]) {
		int n = arr.length - 1;
		int index = findMinValueIndex(arr, 0, n);
		System.out.println(index);
	}

	static int findMinValueIndex(int arr[], int low, int high) {
		if (high < low) {
			return 0;
		}
		if (low == high) {
			return high;
		}
		int mid = (low + high) / 2;
		if (mid < high && arr[mid] > arr[mid + 1])
			return mid + 1;
		if (low < mid && arr[mid] < arr[mid - 1])
			return mid;
		if (arr[low] < arr[mid])
			return findMinValueIndex(arr, 0, mid-1);
		return findMinValueIndex(arr, mid+1,high);
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5}; 
		process_rotations(arr);
	}
}
