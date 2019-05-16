package Revise;

public class Find_MaxSum {
	public static void main(String[] args) {
		int val=compute_val();
		System.out.println(val);
	}

	static int compute_val() {
		int arr[] = new int[] { 5, 5, 10, 100, 10, 5 };
		int incl = arr[0];
		int excl = 0;
		int excl_new = 0;
		for (int i = 1; i < arr.length; i++) {
			excl_new = incl > excl ? incl : excl;
			incl = excl + arr[i];
			excl = excl_new;
		}
		
		return incl>excl?incl:excl;
	}
}
