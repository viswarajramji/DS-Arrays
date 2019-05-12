package matrix;

import java.util.Arrays;

public class RotateBy90 {
	static void rotateBy90(int arr[][], int N) {
		for (int x = 0; x < N / 2; x++) {
			for (int y = x; y  <N - x - 1; y++) {
				int temp = arr[x][y];
				arr[x][y] = arr[y][N - x - 1];
				arr[y][N - x - 1] = arr[N - x - 1][N - y - 1];
				arr[N - x - 1][N - y - 1] = arr[N - y - 1][x];
				arr[N - y - 1][x] = temp;
			}
		}

		System.out.println(Arrays.deepToString(arr));
	}

	public static void main(String[] args) {
        int arr[][] = 
        { 
            {1, 2, 3, 4}, 
            {5, 6, 7, 8}, 
            {9, 10, 11, 12}, 
            {13, 14, 15, 16} 
        }; 	
        rotateBy90(arr, 4);
	}
}
