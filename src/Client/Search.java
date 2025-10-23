package Client;

public class Search {
	
	public static boolean linearSearch(int[] arr, int n, int target) {
		
		for(int i = 0; i < n; i++) {
			int val = arr[i];
			if(val == target) return true;
		}
		
		return false;
	}
	
	
	public static int binarySearch(int[] arr, int n, int target) {
		int low = 0, high = n-1;
		
		int mid = low + (high + low) / 2;
		
		while(low <= high) {
			if(arr[mid] == target) return mid;
			else if(arr[mid] > target) high = mid - 1;
			else low = mid + 1;
			
			
			mid = (low + high) / 2;
        }
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		
		boolean isSearched = linearSearch(arr, arr.length, 15);
		int isSearchedV2 = binarySearch(arr, arr.length, 3);
		
//		System.out.println("value is searched in search space: " + isSearched);
		System.out.println("value is searched in search space: " + isSearchedV2);

	}
}
