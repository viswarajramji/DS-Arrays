package rotations;

public class ReversalMerge {
	void reversal(int a[], int d) {
		int n = a.length;
		reverse(a, 0, d - 1);
		reverse(a, d, n - 1);
		reverse(a, 0, n - 1);
		print_values(a);
	}

	void print_values(int a[]) {
		for (int temp : a) {
			System.out.print(temp+" ");
		}
	}

	void reverse(int a[], int start, int end) {
		int temp;
		while (start < end) {
			temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;

		}
	}

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7}; 
		ReversalMerge rm=new ReversalMerge();
		rm.reversal(arr, 2);

	}
}
