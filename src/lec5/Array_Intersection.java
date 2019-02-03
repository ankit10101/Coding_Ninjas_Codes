package lec5;

import java.util.Scanner;

public class Array_Intersection {
	
	public static void intersection(int[] arr1, int[] arr2){
		
      for(int i = 0; i < arr1.length;i++){
        int k =arr1[i];
        int c = 0;
        for(int j = 0;j < arr2.length;j++ ){
          if(k == arr2[j] && c == 0){
            System.out.println(k);
            c++;  
          }
        }
      }
	}
      
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

	public static void main(String[] args) {
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		intersection(arr1,arr2);

	}

}
