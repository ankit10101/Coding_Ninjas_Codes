package lec6;

import java.util.Scanner;

public class Bubble_sort {
	
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

	public static void bubbleSort(int[] arr) {
		for(int i = 0;i < arr.length - 1;i++) {
			for(int j = 0;j < arr.length - 1;j++) {
				if(arr[j] > arr[j + 1])
				{
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
				
			}
		}
		
		
	}
	public static void main(String[] args) {
		int[] arr = takeInput();
		bubbleSort(arr); 
		printArray(arr);

	}

}
