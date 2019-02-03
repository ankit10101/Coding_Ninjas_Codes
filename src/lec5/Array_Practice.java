package lec5;
import java.util.Scanner; 
public class Array_Practice {
	//Arrange Numbers in Array Question	
public static int[] arrange(int n){
      int i = 0,j = n-1,c = 1;
      int[] arr = new int[n]; 
      for(c = 1; c <= n ;c++){
        if(c % 2 != 0) {
        arr[i] = c;
        i++;
        }
        else {
        arr[j] = c;
        j--;}
      }
      return arr;
	}
public static void printArray(int[] arr) {
	for(int i = 0;i < arr.length;i++) {
		System.out.print(arr[i] + " ");
	}
}

public static int findUnique(int[] arr){
  int j =arr[0];
  for(int i = 0;i < arr.length;i++){
    int c =0;
    j = arr[i];
    for(int k = 0;k < arr.length;k++){
      if(j == arr[k])
        c++;
    }
    if(c == 1)
      break;
  }
  return j;

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
	public static void main(String[] args) {
		//Scanner s = new Scanner(System.in);
		//int n = s.nextInt();
		int[] arr = takeInput();
		//int[] arr = arrange(n);
		//printArray(arr);
		int x =  findUnique(arr);
		System.out.print(x);
	}

}
