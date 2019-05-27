package Revise;

public class Matrix {
	static int MAX = 1000;

	// Returns true if all rows of mat[0..n-1][0..n-1]
	// are rotations of each other.
	static boolean isPermutedMatrix(int mat[][], int n) {
		String temp = "";
		for (int i = 0; i < mat[0].length; i++) {
			temp = temp + "-" + String.valueOf(mat[0][i]);
		}
		temp = temp + temp;
		for (int i = 1; i < mat.length; i++) {
			String curr_val = "";
			for (int j = 0; j < mat.length; j++) {
				curr_val = curr_val + "-" +  String.valueOf(mat[i][j]);
			}

			if (temp.contentEquals(curr_val)) {
				return false;
			}
		}
		return true;

	}

	// Drivers code
	public static void main(String[] args) {
		int n = 4;
		int mat[][] = { { 1, 2, 3, 4 }, { 4, 1, 2, 3 }, { 3, 4, 1, 2 }, { 2, 3, 4, 1 } };
		if (isPermutedMatrix(mat, n)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
