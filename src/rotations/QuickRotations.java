package rotations;

import java.util.Arrays;

public class QuickRotations {
	void computeRotations(int a[], int d) {
		int i, j, k, temp;
		int n = a.length;
		int gcd = getGCD(d, a.length);
		System.out.println(gcd);
		for (i = 0; i < gcd; i++) {
			temp = a[i];
			j = i;
			while (true) {
				k = j + d;
				if (k >= n) {
					k = k - n;
				}
				if (k == i) {
					break;
				}
				a[j] = a[k];
				j = k;
			}
			a[j] = temp;

		}
		System.out.println(Arrays.toString(a));
	}

	int getGCD(int a, int b) {
		if (b == 0) {
			return a;
		}
		return getGCD(b, (a % b));
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		QuickRotations qr = new QuickRotations();
		qr.computeRotations(arr, 3);

	}
}
