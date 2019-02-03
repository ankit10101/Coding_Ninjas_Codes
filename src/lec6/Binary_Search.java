package lec6;
import java.util.Scanner;
public class Binary_Search {

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
        public static int binarySearch(int[] arr,int elem) {
        	int index = -1;
        	int start = 0;
        	int end = arr.length - 1;
        	while(start <= end) {
        		int mid = (start + end) / 2;
        		if(elem == arr[mid])
        		{
        			index = mid;
        			break;
        			
        		}
        		else if(elem < arr[mid] ) {
        			end = mid - 1;
        		}
        		else
        			{
        			  start = mid + 1;
        			}
        	}
        	return index; 
        }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = takeInput();
		int elem = s.nextInt();
	    int index = binarySearch(arr,elem);
		binarySearch(arr,elem);
		System.out.print(index);

	}

}
