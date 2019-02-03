package dynamic_programming;
import java.util.Scanner;
public class Fibonnaci {

	public static int recursiveFibonacci(int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		int ans1 = recursiveFibonacci(n - 1);
		int ans2 = recursiveFibonacci(n - 2);
		return ans1 + ans2;
	}

	public static int memorisationFibonnaci(int n,int[] storage) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			storage[1] = 1;
			return 1;
		}		
		if(storage[n] == 0) {
			int ans1;
			if(storage[n - 1] == 0){
				ans1 = memorisationFibonnaci(n - 1, storage);
				storage[n - 1] = ans1;
			}else {
				ans1 = storage[n-1];
			}

			int ans2;
			if(storage[n - 2] == 0){
				ans2 = memorisationFibonnaci(n - 2, storage);
				storage[n - 2] = ans2;
			}else {
				ans2 = storage[n - 2];
			}
			storage[n] = ans1 + ans2;
		}
		return storage[n];
	}

	public static int iterativeFibonnaci(int n) {
		int[] storage = new int[n + 1];
		if(n == 0) {
			return 0;
		}
		storage[1] = 1;
		for(int i = 2;i <= n;i++) {
			storage[i] = storage[i - 1] + storage[i - 2];
		}
		return storage[n];
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] storage = new int[n + 1];
		System.out.println(recursiveFibonacci(n));
		System.out.println(memorisationFibonnaci(n, storage));
		System.out.println(iterativeFibonnaci(n));
	}

}
