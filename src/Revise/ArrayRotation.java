package Revise;

import java.util.Arrays;

public class ArrayRotation {
	public static void main(String[] args) {
		int arr[] =  { 1, 2, 3, 4, 5, 6, 7 }; 
		int d = 2;
		int n = arr.length;
		int gcd = gcd(d, n);
		for (int i = 0; i < gcd; i++) {
			int temp = arr[i];
			int j = i;
			while (true) {
				int k = j + d;
				if (k >= n) {
					k = k - n;
				}
				if (k == i)
					break;
				arr[j] = arr[k];
				j = k;
			}
			arr[j] = temp;
		}
		System.out.println(Arrays.toString(arr));

	}

	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}
}
