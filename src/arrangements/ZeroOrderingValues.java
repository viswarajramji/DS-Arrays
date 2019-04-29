package arrangements;

import java.util.Arrays;

public class ZeroOrderingValues {
	static void process_arr_values(int arr[]) {
		int count = -1;
		int temp;

		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != 0 && arr[i + 1] == arr[i]) {
				arr[i] = arr[i] * 2;
				arr[i + 1] = 0;
				i++;
			}
		}
		push_zero_valus(arr);
	}

	static void push_zero_valus(int arr[]) {
		int count = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				count++;
				int temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[] = {2, 2, 0, 4, 0, 8};
		process_arr_values(arr);
	}
}
