package matrix;

public class LTM_UTM {
	static void compute_lower_tra(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i < j) {
					System.out.print("0 ");
				} else {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println("");
		}

	}

	static void compute_upper_tra(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i > j) {
					System.out.print("0 ");
				} else {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("Lower");
		compute_lower_tra(matrix);
		System.out.println("Upper");
		compute_upper_tra(matrix);
	}
}
