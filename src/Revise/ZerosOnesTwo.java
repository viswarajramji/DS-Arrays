package Revise;

import java.util.Arrays;

public class ZerosOnesTwo {
	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		int low = 0, mid = 0, high = arr.length - 1;
		while (mid <= high) {
			switch (arr[mid]) {
			case 0:
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
				break;

			case 1:
				mid++;
				break;
			case 2:
				temp = arr[high];
				arr[high] = arr[mid];
				arr[mid] = temp;
				high--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
