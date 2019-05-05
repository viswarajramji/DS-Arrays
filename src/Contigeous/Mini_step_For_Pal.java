package Contigeous;

public class Mini_step_For_Pal {
	static int find_min_step(int arr[]) {
		int n = arr.length;
		int i, j;
		int ans = 0;
		for (i = 0, j = n - 1; i <= j;) {
			if (arr[i] == arr[j]) {
				i++;
				j--;
			} else if (arr[i] < arr[j]) {
				i++;
				ans++;
				arr[i] += arr[i - 1];
			} else {
				ans++;
				j--;
				arr[j] += arr[j + 1];
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int arr[] = { 11, 14, 15, 99 };
		int operations = find_min_step(arr);
		System.out.println("Number of operations:" + operations);

	}
}
