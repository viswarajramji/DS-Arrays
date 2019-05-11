package searching;

public class InfinitySearch {
	static void find_values(int arr[], int key) {
		int l = 0, h = 1;
		int val = arr[0];
		while (val < key) {
			l = h;
			if (2 * h > arr.length - 1) {
				h = arr.length - 1;
			} else {
				h = 2 * h;
			}
			val = arr[h];
		}
	
		int index=perform_binary_search(arr,l,h,key);
		System.out.println(index);

	}

	static int perform_binary_search(int arr[], int low, int high, int key) {
		if (high < low) {
			return -1;
		}
		int mid = (low + high) / 2;
		if (arr[mid] == key) {
			return mid;
		}

		if (arr[mid] > key) {
			return perform_binary_search(arr, low, mid - 1, key);
		}
		return perform_binary_search(arr, mid + 1, high, key);
	}

	public static void main(String[] args) {
		int arr[] = {3, 5, 7, 9, 10, 90,  
                100, 130, 140, 160, 170}; 
		int key = 130;
		find_values(arr, key);
	}
}
