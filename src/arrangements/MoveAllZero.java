package arrangements;

import java.util.Arrays;

public class MoveAllZero {
	static void MoveAllZero(int arr[]) {
		int i = -1, temp;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != 0) {
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		System.out.println("All zero values moved to end " + Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[] = { 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
		MoveAllZero(arr);
	}
}
