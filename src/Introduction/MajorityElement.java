package Introduction;

import java.util.Arrays;

public class MajorityElement {
	public static void main(String[] args) {
		int arr[] = { 3, 3, 4, 2, 1, 1, 2, 4, 4 };
		int n = arr.length - 1;
		int element = -1;
		Arrays.sort(arr);
		int cnt = 1, val = arr[n], max_cnt = Integer.MIN_VALUE;
		for (int i = n - 1; i >= 0; i--) {
			if (val == arr[i]) {
				cnt++;
			} else {
				cnt = 1;
				val=arr[i];
			}
			if (max_cnt < cnt) {
				max_cnt = cnt;
				element = arr[i];
			}

		}

		if (max_cnt >= n / 2) {
			System.out.println("Majority elements found : " + element);
			return;
		}
		System.out.println("Majority elements not found ");
	}
}
