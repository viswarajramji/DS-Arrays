package Revise;

public class FindMissingIndex {
	static void find_missing_val(int arr[]) {
		int index = compute_missing_entries(arr, 0, arr.length - 1);
		if (index == -1) {
			System.out.println("Values are proper");
			return;
		}
		System.out.println(index);

	}

	static int compute_missing_entries(int arr[], int start, int end) {
		if (start > end)
			return -1;
		int mid = (start + end) / 2;
		if (start != arr[start]) {
			return start;
		}
		if (arr[mid] == mid)
			return compute_missing_entries(arr, mid + 1, end);
		return compute_missing_entries(arr, start, mid - 1);
	}

	public static void main(String[] args) {
		int arr[] = { 0, 1, 2, 3,4, 5, 6, 7, 8, 9 };
		find_missing_val(arr);
	}
}
