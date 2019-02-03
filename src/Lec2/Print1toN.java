package Lec2;

import java.util.Scanner;

public class Print1toN {
	public static void printTillN(int n){
		for(int i = 1;i <= n;i++)
		{
			System.out.print(i + " ");
		}
	}
	

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	printTillN(n);
	}

}
