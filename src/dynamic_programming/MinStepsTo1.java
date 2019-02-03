package dynamic_programming;
import java.util.Scanner;
public class MinStepsTo1 {

	public static int countStepsTo1(int n) {
		if(n == 1) {
			return 0;
		}
		if(n == 2 || n == 3) {
			return 1;
		}
		int ans1 = countStepsTo1(n - 1);
		int ans2 = Integer.MAX_VALUE,ans3 = Integer.MAX_VALUE;
		if(n % 2 == 0) {
			ans2 = countStepsTo1(n / 2);
		}
		if(n % 3 == 0) {
			ans3 = countStepsTo1(n / 3); 
		}
		return  1 + Math.min(ans1,Math.min(ans2, ans3));
	}

	public static int countStepsTo1Memorisation(int n,int[] storage) {	
		if(n == 1) {
			storage[1] = 0;
			return 0;
		}
		if(n == 2) {
			storage[2] = 1;
			return 1;
		}
		if(n == 3) {
			storage[3] = 1;
			return 1;
		}
		int ans1;
		if(storage[n - 1] == 0) {
			ans1 = countStepsTo1Memorisation(n - 1, storage);
			storage[n - 1] = ans1;
		}else {
			ans1 = storage[n - 1]; 
		}

		int ans2 = Integer.MAX_VALUE;
		if(n % 2 == 0) {
			if(storage[n/2] == 0) {
				ans2 = countStepsTo1Memorisation(n/2, storage);
				storage[n/2] = ans2;
			}else {
				ans2 = storage[n/2]; 
			}	
		}

		int ans3 = Integer.MAX_VALUE;
		if(n % 3 == 0) {
			if(storage[n/3] == 0) {
				ans3 = countStepsTo1Memorisation(n/3, storage);
				storage[n/3] = ans3;
			}else {
				ans3 = storage[n/3]; 
			}	
		}

		storage[n] = 1 + Math.min(ans1,Math.min(ans2, ans3));
		return storage[n];
	}

	public static int countStepsTo1Iterative(int n)
	{
		int[] storage = new int[ n + 1];
		for(int i = 2;i <= n; i++) {
			int ans1 = storage[i- 1];
			int ans2 = Integer.MAX_VALUE,ans3 = Integer.MAX_VALUE;
			if(i % 2 == 0) {
				ans2 = storage[i / 2];
			}
			if(i % 3 == 0) {
				ans3 = storage[i / 3];
			}
			storage[i] = 1 + Math.min(ans1,Math.min(ans2, ans3));
		}
		return storage[n];
	}



	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] storage = new int[n + 1];
		System.out.println(countStepsTo1(n));
		System.out.println(countStepsTo1Memorisation(n, storage));
		System.out.println(countStepsTo1Iterative(n));
	}
}
