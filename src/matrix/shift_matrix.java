package matrix;

public class shift_matrix {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int k = 2;
		for (int i = 0; i < arr.length; i++) {
			for (int j = k; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			for (int j = 0; j < k; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
