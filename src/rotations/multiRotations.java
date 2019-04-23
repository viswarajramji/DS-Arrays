package rotations;

public class multiRotations {
	static void print_orders(int arr[],int k) {
		int n=arr.length;
		for(int i=k;i<n+k;i++) {
			System.out.println("values : "+arr[i%n]);
		}
	}
	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 7, 9 };
		print_orders(arr, 3);
	}
}
