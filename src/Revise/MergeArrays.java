package Revise;

import java.util.Arrays;

public class MergeArrays {
	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 6, 7, 8, 8, 9 };
		int temp[] = new int[arr1.length + arr2.length];
		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				temp[k++] = arr1[i++];
			} else {
				temp[k++] = arr2[j++];
			}
		}

		while (i < arr1.length) {
			temp[k++] = arr1[i++];
		}
		while (j < arr1.length) {
			temp[k++] = arr2[j++];
		}

		System.out.println(Arrays.toString(temp));
	}
}
