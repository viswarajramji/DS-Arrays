package Revise;

public class Union {
	public static void main(String[] args) {
		int arr1[] = { 1, 3, 4, 5, 7 };
		int arr2[] = { 2, 3, 5, 6 };
		int m = 0;
		int n = 0;
		while (m < arr1.length && n < arr2.length) {
			if (arr1[m] < arr2[n]) {
				System.out.println(arr1[m]);
				m++;
			} else if (arr1[m] > arr2[n]) {
				System.out.println(arr2[n]);
				n++;
			} else {
				System.out.println(arr1[m]);
				m++;
				n++;
			}
		}
	}
}
