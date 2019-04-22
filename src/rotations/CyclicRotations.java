package rotations;

public class CyclicRotations {
	static void cyclic_rotations(int arr[]) {
		int x = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = x;
		print_results(arr);
	}

	static void print_results(int arr[]) {
		for (int temp : arr) {
			System.out.print(temp+" ");
		}
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		cyclic_rotations(arr);
		
	}
}
