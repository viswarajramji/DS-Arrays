package order_statics;

class FindMaxTwoElem {
	public static void main(String[] args) {
		int arr[] = new int[] { 5, 5, 10, 100, 10, 5 };
		int incl = arr[0];
		int excl = 0;
		int excl_temp;
		for (int i = 1; i < arr.length; i++) {
			excl_temp = incl > excl ? incl : excl;
			incl = excl + arr[i];
			excl = excl_temp;
		}
		System.out.println(incl>excl ? incl:excl);
	}
}
