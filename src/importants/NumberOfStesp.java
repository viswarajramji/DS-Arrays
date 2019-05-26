package importants;

public class NumberOfStesp {
	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		int jumps[] = new int[arr.length];
		jumps[0] = 0;
		int n=arr.length;
		for (int i = 1; i < arr.length; i++) {
			jumps[i] = Integer.MAX_VALUE;
			for (int j = 0; j < i; j++) {
				if (i <= j + arr[j] && jumps[j] != Integer.MAX_VALUE) {
					jumps[i] = Math.min(jumps[i], jumps[j] + 1);
					break;
				}
			}
		}
		System.out.println(jumps[n - 1]);
	}
}
