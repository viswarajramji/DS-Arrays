package rotations;

public class RotationCounts {
	
	static void rotation_counts(int arr[]) {
		int n=arr.length-1;
		int index=findIndexOfSmall(arr,0,n);
		System.out.println("No of rotations needed : "+index);
				
	}
	
	static int  findIndexOfSmall(int arr[],int low,int high) {
		if(high<low)
			return 0;
		if(high==low) 
			return low;
		int mid=(low+high)/2;
		if(mid<high && arr[mid]>arr[mid+1])
			return mid+1;
		if(low<mid && arr[mid]<arr[mid-1]) 
			return mid;
		if(arr[low] < arr[mid])
			return findIndexOfSmall(arr,mid+1,high);
		return findIndexOfSmall(arr,low,mid-1);
		

	}
	public static void main(String[] args) {
      int arr[]=    {7, 9, 11, 12, 15};
      rotation_counts(arr);
	}
}
