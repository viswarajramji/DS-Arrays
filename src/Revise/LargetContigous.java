package Revise;

public class LargetContigous {
	public static void main(String[] args) {
		int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int max_overall = 0;
		int max_here = 0;
		for (int i = 0; i < arr.length; i++) {
			max_here += arr[i];
			if (max_here > max_overall) {
				max_overall = max_here;
			}
			if (max_here < 0)
				max_here = 0;
		}
		System.out.println(max_overall);
	}
}
