package sorting;

import java.util.Arrays;

public class split_2_types {
	public static void main(String[] args) {
		int arr[] = { 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1 };
		int index = 0;
		int rindex = 0;
		int end = arr.length - 1;
		while (index <= end) {
			if (arr[index] != 0) {
				index++;
				continue;
			}
			int temp = arr[rindex];
			arr[rindex] = arr[index];
			arr[index] = temp;
			rindex++;
			index++;
		}
		System.out.println(Arrays.toString(arr));
	}
}
