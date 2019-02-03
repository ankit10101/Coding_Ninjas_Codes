package lec6;

import java.util.Scanner;

public class Insertion_Sort {

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	public static void printArray(int[] arr) {
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void insertionSort(int[] arr) {
		for(int j = arr.length - 1 ; j > 0 ;j--){
			for(int i = 0;i <= j;i++  ){
				if(arr[j] < arr[i]) {
					int t =  arr[j];
					arr[j] = arr[i];
					arr[i] = t;
				}		
			}
		}	
	}

	public static void main(String[] args) {
		int[] arr = takeInput();
        insertionSort(arr);
		printArray(arr);

	}

}
