package Lec2;

import java.util.Scanner;

public class SimpleInterest {
	public static int findSimpleInterest(int p,int r,int t) {
	int x = (p*r*t)/100;
	return x;
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int p = s.nextInt();
		int r = s.nextInt();
		int t = s.nextInt();
		int SI = findSimpleInterest(p,r,t);
		System.out.print(SI);
	}

}
