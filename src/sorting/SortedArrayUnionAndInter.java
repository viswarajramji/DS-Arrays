package sorting;

import java.util.Arrays;

public class SortedArrayUnionAndInter {
	public static void main(String[] args) {
		int arr1[] = { 2, 5, 6 };
		int arr2[] = { 4, 6, 8, 10 };
		int temp[] = new int[arr1.length + arr2.length];
		int l = 0;
		int r = 0;
		int k = 0;
		while (l < arr1.length && r < arr2.length) {
			if (arr1[l] == arr2[r]) {
				temp[k++] = arr1[l++];
				r++;
			} else if (arr1[l] < arr2[r]) {
				temp[k++] = arr1[l++];
			} else {
				temp[k++] = arr2[r++];
			}
		}

		while (l < arr1.length) {
			temp[k++] = arr1[l++];
		}

		while (r < arr2.length) {
			temp[k++] = arr2[r++];
		}
		for (int i = 0; i < k; i++)
			System.out.println(temp[i]);

		// for intersections
		temp = new int[arr1.length + arr2.length];
		k = 0;
		l = 0;
		r = 0;
		while (l < arr1.length && r < arr2.length) {
			if (arr1[l] == arr2[r]) {
				temp[k++] = arr1[l];
				l++;
				r++;
			} else if (arr1[l] < arr2[r]) {
				l++;
			} else {
				r++;
			}
		}

		for (int i = 0; i < k; i++)
			System.out.println("Intersection:" + temp[i]);

	}

}
