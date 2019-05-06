package Contigeous;

public class MiniSteps {
	public static void find_min_step(int arr[]) {
		int val = find_min_values_process(arr);
		System.out.println(val);
	}

	public static int find_min_values_process(int arr[]) {
		if (arr.length == 1) {
			return -1;
		}

		if (arr[0] == 0) {
			return -1;
		}
		int n = arr.length;
		int step = arr[0];
		int max_reach = arr[0];
		int jump = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i == n - 1)
				return jump;

			max_reach = Math.max(max_reach, i + arr[i]);
			
			step--;
			
			if (step == 0) {
				
				jump++;

				if (i >= max_reach) {
					return -1;
				}

				step = max_reach - i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		find_min_step(arr);
	}
}
