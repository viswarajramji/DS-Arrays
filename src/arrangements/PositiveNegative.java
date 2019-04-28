package arrangements;

import java.util.Arrays;

public class PositiveNegative {
	static void process_arr(int arr[]) {
		int i = -1, temp;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] < 0) {
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}

		}

		System.out.println(Arrays.toString(arr));
		int pos = i + 1;
		int neg = 0;
		while (pos < arr.length && neg < pos && arr[neg] < 0) {
			temp = arr[pos];
			arr[pos] = arr[neg];
			arr[neg] = temp;
			pos++;
			neg+=2;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		process_arr(arr);
	}
}
