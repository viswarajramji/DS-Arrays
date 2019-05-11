package searching;

import java.util.Arrays;

public class ExcludesElemets {
	static boolean isPresent(int B[], int x) {
		for (int i = 0; i < B.length; i++)
			if (B[i] == x)
				return true;

		return false;
	}

	public static void main(String[] args) {
		int arr_in[] = { 3, 4, 5, -4, 6 };
		int arr_out[] = { 1, 8, 5 };
		int max_overall = Integer.MIN_VALUE;
		int max = 0;
		int s = 0;
		int start = 0;
		int end = 0;
		for (int i = 0; i < arr_in.length; i++) {
			if (max < 0 || isPresent(arr_out, arr_in[i])) {
				max = 0;
				s = i + 1;
				continue;
			}
			max += arr_in[i];
			if (max_overall < max) {
				max_overall = max;
				start = s;
				end = i;
			}
		}
		System.out.println(max_overall);
		System.out.println("start Index=" + start + " End Index=" + end);
	}
}
