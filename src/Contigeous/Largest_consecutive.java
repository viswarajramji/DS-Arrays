package Contigeous;

public class Largest_consecutive {
	static void get_largest_values(int arr[]) {
		int max_here = 0;
		int s = 0, e = 0, start = 0, end = 0;
		int max_over_all = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max_here = max_here + arr[i];
			if (max_here > max_over_all) {
				max_over_all = max_here;
				start = s;
				end = i;
			}

			if (max_here < 0) {
				s = i + 1;
				max_here = 0;

			}
		}

		System.out.println("sum=" + max_over_all + " start=" + start + " end=" + end);
	}

	public static void main(String[] args) {
		int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		get_largest_values(arr);
	}
}
