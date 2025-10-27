package Client;

import java.util.Arrays;

public class Sorting {
		
	public static void swap(int[] arr, int i, int j) {
//		arr[i] = arr[i] ^ arr[j];
//		arr[j] = arr[i] ^ arr[j];
//		arr[i] = arr[i] ^ arr[j];
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
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
	
	public static void selectionSort(int[] arr, int n) {
		for(int i = 0; i < n; i++) {
			int minVal = arr[i], index = i;
			
			for(int j = i; j < n; j++) {
				if(arr[j] < minVal) {
					minVal = arr[j];
					index = j;
				}
			}
			swap(arr, index, i);
		}
	}
	
	public static void bubbleSort(int[] arr, int n) {
		for(int i = 0; i < n; i++) {
			int c = 0;
			for(int j = 0; j < n-1; j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
					c++;
				}
			}
			if(c == 0) break;
		}
	}
	
	
	public static int[] sortTwoArray(int[] a, int[] b) {
		int m = a.length, n = b.length;
		
		int[] res = new int[m+n];
		int index = 0;
		
		int p1 = 0,  p2 = 0;
		while(p1 != m && p2 != n) {
			if(a[p1] < b[p2]) {
				res[index] = a[p1];
				p1++;
			}else {
				res[index] = b[p2];
				p2++;
			}
			index++;
		}
		
		while(p1 != m) {
			res[index++] = a[p1++];
		}
		
		while(p2 != n) {
			res[index++] = b[p2++];
		}
		
		return res;
		
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 1, 3, 5, 2, 4, 8, 7, 5, 6};
		
		int[] selectArr = {2, 8, 4, -1, 6, 7, 5, 10, -1};
		
		int n = arr.length;
		
//		insertionSort(arr, n);
//		
//		printArr(arr);
//		
////		System.out.println();
//		
////		selectionSort(selectArr, selectArr.length);
//		
////		printArr(selectArr);
//		
//		System.out.println();
//		
//		bubbleSort(selectArr, selectArr.length);
//		
//		printArr(selectArr);
		
		
		
		int[] arr1 = {2, 4, 5};		
		int[] arr2 = {1, 3, 6, 7, 8, 9};
		
		int[] output = sortTwoArray(arr1, arr2);
		
		System.out.println(Arrays.toString(output));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
