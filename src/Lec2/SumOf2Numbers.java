package Lec2;

import java.util.Scanner;

public class SumOf2Numbers {
	public static int findSum(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = findSum(a,b); 
		System.out.print(c);
	}

}
