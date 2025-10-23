package Client;

public class Main {
	
	public static int sumOfArray(int[] arr, int n) {
		int ans = 0;
		for(int i = 0; i < n; i++) {
			ans += arr[i];
		}
		
		return ans;
	}

	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		int res = sumOfArray(arr, arr.length);
		
		System.out.println(res);
	}
	
}
