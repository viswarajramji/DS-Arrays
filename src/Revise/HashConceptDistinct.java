package Revise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashConceptDistinct {
	public static void main(String[] args) {
		Set<Integer> overall = new HashSet<>();
		int mat[][] = { { 12, 1, 14, 3, 16 }, { 14, 2, 1, 3, 35 }, { 14, 1, 14, 3, 11 }, { 14, 25, 3, 2, 1 },
				{ 1, 18, 3, 21, 14 } };

		int n = 5;
		for (int i = 0; i < mat[0].length; i++) {
			overall.add(mat[0][i]);
		}
		for (int i = 1; i < n; i++) {
			Set<Integer> temp = new HashSet<>();
			for (int j = 0; j < n; j++) {
				if (overall.contains(mat[i][j])) {
					temp.add(mat[i][j]);
				}
			}
			overall.clear();
			overall.addAll(temp);
		}
		System.out.println(Arrays.toString(overall.toArray()));
	}
}
