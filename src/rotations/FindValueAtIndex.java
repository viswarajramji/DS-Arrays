package rotations;

public class FindValueAtIndex {
	static int perform_rotations(int arr[], int rotation, int range[][], int index) {
		for (int i = rotation - 1; i >= 0; i--) {
			int left = range[i][0];
			int right = range[i][1];
			if (left <= index && index <= right) {
				if (left == index) {
					index = right;
				} else {
					index--;
				}
			}
		}
		return arr[index];
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int range[][] = { { 0, 2 }, { 0, 3 } };
		int rotation = 2;
		int index = 1;
		int val=perform_rotations(arr, rotation, range, index);
		System.out.println(val);
	}
}
