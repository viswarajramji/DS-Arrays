package rotations;

public class FindMaxValRotations {
	public static void main(String[] args) {
		 int arr[] = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int arrSum = 0, cur_val = 0;
		for (int i = 0; i < arr.length; i++) {
			arrSum = arrSum + arr[i];
			cur_val = cur_val + (i * arr[i]);
		}

		int maxVal = cur_val;
		int n=arr.length;
		for (int j = 1; j <n ; j++) {
			cur_val = cur_val + arrSum - n * arr[n - j];
			if (cur_val > maxVal)
				maxVal = cur_val;
		}
		System.out.println(maxVal);
	}
}
