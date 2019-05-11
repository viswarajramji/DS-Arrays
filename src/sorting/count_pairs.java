package sorting;

import java.util.Arrays;

public class count_pairs {
	public static void main(String[] args) {
		int x[] = {};
		int y[] = {};

		count_pairs(x, y);
	}

	static void count_pairs(int x[], int y[]) {
		int noOfY[] = new int[5];
		for (int i = 0; i < y.length; i++) {
			if (y[i] < 5)
				noOfY[y[i]]++;
		}
		Arrays.sort(y);
		int cnt = 0;
		for (int i = 0; i < x.length; i++) {
			cnt += find_pairs(x[i], y, noOfY);
		}
	}

	static int find_pairs(int x, int y[], int noOfY[]) {
		int ans = 0;
		if (x == 0)
			return 0;
		if (x == 1)
			return noOfY[0];
		int idx = Arrays.binarySearch(y, x);
		if (idx < 0) {
			int index = Math.abs(idx + 1);
			ans += y.length - index;
		} else {
			while (y[idx] == x) {
				idx++;
			}
			ans += y.length - idx;
		}

		ans += noOfY[0] + noOfY[1];
		if (x == 2)
			ans -= noOfY[3] + noOfY[4];

		if (x == 3)
			ans += noOfY[2];
		return ans;
	}
}
