package rotations;

import java.util.Arrays;

public class CyclicRotations {
	static void rotate(int arr[]) {
		int x = arr[arr.length - 1], i;
		for (i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = x;
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		CyclicRotations cr=new CyclicRotations();
		cr.rotate(arr);
	}
}
