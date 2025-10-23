package Client;

public class Sorting {
		
	public static void swap(int[] arr, int i, int j) {
		arr[i] = arr[i] ^ arr[j];
		arr[j] = arr[i] ^ arr[j];
		arr[i] = arr[i] ^ arr[j];
	}
	
	public static void placeInCorrectPostion(int[] arr, int indx) {
		for(int i = indx; i > 0; i--) {
			int val = arr[i];
			
			if(val > arr[i-1]) return;
			swap(arr, i, i-1);
		}
	}
	
	
	public static void printArr(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void insertionSort(int[] arr, int n) {
		for(int i = 1; i < n; i++) {
			placeInCorrectPostion(arr, i);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 1, 3, 5, 2, 4, 8, 7, 5, 6};
		
		int n = arr.length;
		
		insertionSort(arr, n);
		
		printArr(arr);
		
		
	}
}
