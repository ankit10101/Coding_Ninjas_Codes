package lec6;

import java.util.Scanner;

public class Selection_Sort {
	
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
	
	public static void selectionSort(int[] arr) {
		for(int i = 0;i < arr.length - 1;i++){
			int min = arr[i];
			int minIndex = i;
			for(int j = i + 1;j < arr.length;j++) {
				if(arr[j] < min)
				{
					min = arr[j];
					minIndex = j;
				}
			}
			if(minIndex != i)
			{
				int t = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = t;
			}
		}
		
	}

	public static void main(String[] args) {
		int[] arr = takeInput();
        selectionSort(arr);
		printArray(arr);

	}

}
