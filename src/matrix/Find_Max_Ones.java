package matrix;

public class Find_Max_Ones {
	public static void main(String[] args) {
		int arr[][] = { { 0, 0, 0, 1 }, { 0, 1, 1, 1 }, { 1, 1, 1, 1 }, { 0, 0, 0, 0 } };
		process_values(arr);
	}

	static int find_pivot_element(int arr[], int low, int high) {
		if (low <= high) {
			int mid = (low + high) / 2;
			if (mid == 0 || arr[mid] == 1 && arr[mid - 1] == 0) {
				return mid;
			} else if (arr[mid] == 0)
				return find_pivot_element(arr, mid + 1, high);
			else
				return find_pivot_element(arr, low, mid - 1);
		}
		return -1;
	}

	static void process_values(int arr[][]) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			int index = find_pivot_element(arr[i], 0, arr[i].length - 1);
			if (index >= 0) {
				int temp = arr[i].length - index;
				if (cnt < temp) {
					cnt = temp;
				}
			}
		}
		System.out.println(cnt);
	}
}
