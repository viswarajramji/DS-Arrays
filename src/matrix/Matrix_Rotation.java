package matrix;

import java.util.Arrays;

public class Matrix_Rotation {

	static void process_matrix(int arr[][], int m, int n) {
		int row = 0;
		int col = 0;

		while (row < m && col < n) {

			if (row + 1 == m || col + 1 == n) {
				break;
			}
			int prev = arr[row + 1][col];

			for (int i = col; i < n; i++) {
				int temp = arr[row][i];
				arr[row][i] = prev;
				prev = temp;
			}

			row++;
			
			for (int i = row; i < m; i++) {
				int temp = arr[i][n - 1];
				arr[i][n - 1] = prev;
				prev = temp;
			}
			n--;

			for (int i = n - 1; i >= col; i--) {
				int temp = arr[m - 1][i];
				arr[m - 1][i] = prev;
				prev = temp;
			}

			m--;

			for (int i = m - 1; i >= row; i--) {
				int temp = arr[i][col];
				arr[i][col] = prev;
				prev = temp;
			}

			col++;

		}

		System.out.println(Arrays.deepToString(arr));
	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		process_matrix(arr, 4, 4);
	}
}
