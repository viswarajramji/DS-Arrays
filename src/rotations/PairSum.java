package rotations;

public class PairSum {
	static int getPairCount(int arr[], int X) {
		int n = arr.length;
		int pivot = getPivotElement(arr, 0, n-1);
		System.out.println(pivot);
		return compute_pairs(arr, X, pivot, n);
	}

	static int compute_pairs(int arr[], int X, int index, int n) {
		int cnt = 0;
		int r = index;
		int l = (index + 1) % n;
		while (l != r) {
			if (arr[l] + arr[r] == X) {
				System.out.println(arr[l]+" "+arr[r]);
				++cnt;
				if (l == (r - 1 + n) % n) {
					return cnt;
				}
				l = (l + 1) % n;
				r = (r - 1 + n) % n;
			}

			if (arr[l] + arr[r] < X) {
				l = (l + 1) % n;
			}
			if (arr[l] + arr[r] > X) {
				r = (r - 1 + n) % n;
				
			}

		}
		return cnt;
	}

	static int getPivotElement(int arr[], int low, int high) {
		if (high < low) {
			return -1;
		}
		if (high == low)
			return low;

		int mid = (low + high) / 2;
		if (mid < high && arr[mid] > arr[mid + 1])
			return mid;
		if (low < mid && arr[mid - 1] > arr[mid])
			return mid - 1;
		if (arr[low] > arr[mid])
			return getPivotElement(arr, low, mid - 1);
		return getPivotElement(arr, mid + 1, high);

	}

	public static void main(String[] args) {
		int arr[] = { 4, 5,6,0, 1, 2, 3 };
		System.out.println(getPairCount(arr, 6));
	}
}
