package order_statics;

public class FindLargest3Values {
	static void find_max_3_values(int arr[]) {
		if (arr.length < 3) {
			System.out.println("Not enough elements");
			return;
		}
		int first, second, third;
		first = second = third = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int x = arr[i];
			if (x > first) {
				third = second;
				second = first;
				first = x;
			} else if (x > second) {
				third = second;
				second = x;
			} else {
				third = x;
			}
		}
		System.out.println("Values are as follows " + "first=" + first + " second=" + second + " third=" + third);
	}

	public static void main(String[] args) {
		int arr[] = { 4, 3, 6, 1, 9 };
		find_max_3_values(arr);
	}
}
