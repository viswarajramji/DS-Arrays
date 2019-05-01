package order_statics;

public class Print_all_Numbers {
	static void print_2_number(int arr[]) {
		int first, second;
		first = second = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int x = arr[i];
			if (x > first) {
				second = first;
				first = x;
			}
			if (x > second) {
				second = x;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < second) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 8, 7, 1, 5 };
		print_2_number(arr);
	}
}
