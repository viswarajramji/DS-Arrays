package matrix;

public class Find_Max_Each_row {
	static void process_values(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("" + find_min_values(arr[i]));
		}
	}

	static int find_min_values(int arr[]) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		return max;
	}

	public static void main(String[] args) {
		int arr[][] = { { 3, 4, 1, 8 }, 
				{ 1, 4, 9, 11 },
				{ 76, 34, 21, 1 }, 
				{ 2, 1, 4, 5 } };
		process_values(arr);
	}
}
