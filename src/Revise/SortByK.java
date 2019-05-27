package Revise;

public class SortByK {
	public static void main(String[] args) {
		int k = 2;
		int[][] mat = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int j = 0;
		int N = 4;
		while (j < N) {
			for (int i = k; i < N; i++) {
				System.out.print(mat[j][i]);
			}

			for (int i = 0; i < k; i++) {
				System.out.print(mat[j][i]);
			}
			System.out.println();
			j++;
		}
	}
}
