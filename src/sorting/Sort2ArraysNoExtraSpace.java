package sorting;

import java.util.Arrays;

public class Sort2ArraysNoExtraSpace {
	public static void main(String[] args) {
		int arr1[] = new int[] { 1, 5, 9, 10, 15, 20 };
		int arr2[] = new int[] { 2, 3, 8, 13 };
		int m = arr1.length;
		int n = arr2.length;
		for (int i = n - 1; i >= 0; i--) {
			int last = arr1[m - 1];
			int j = m - 2;
			for (; j >= 0 && arr2[i] < arr1[j]; j--) {
				arr1[j + 1] = arr1[j];
			}
			if (j != m - 2 || last > arr1[i]) {
				arr1[j + 1] = arr2[i];
				arr2[i] = last;
			}
		}
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

	}
}
