package sorting;

public class WaveSorting {
	static void print_wave_format(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i+=2) {
			if (i > 0 && arr[i - 1] > arr[i])
				swap(arr, i - 1, i);
			if (i < n - 1 && arr[i] < arr[i + 1]) {
				swap(arr, i + 1, i);
			}
		}
	}

	static void swap(int arr[], int src, int dest) {
		int temp = arr[src];
		arr[src] = arr[dest];
		arr[dest] = temp;
	}

	static void print_arr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		int arr[] = {10, 5, 6, 3, 2, 20, 100, 80};
		print_wave_format(arr);
		print_arr(arr);
	}
}
