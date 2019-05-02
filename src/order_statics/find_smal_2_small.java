package order_statics;

public class find_smal_2_small {
	public static void main(String[] args) {
		int arr[] = {4,5,1,6,9};
		int small, small2;
		small = small2 = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int x = arr[i];
			if (x < small) {
				small2 = small;
				small = x;

			} else if (x < small2) {
				small2 = x;
			}
		}
		System.out.println("Small : " + small + " small2 : " + small2);
	}
}
