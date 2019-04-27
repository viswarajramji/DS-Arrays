package rotations;

public class leftRotations {
	static void rotations(int a[], int n, int k) {
		for (int i = k; i < n + k; i++) {
			System.out.println(a[i % n]);
		}
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int n = a.length;
		int k = 2;
		leftRotations.rotations(a, n, k);

	}
}
