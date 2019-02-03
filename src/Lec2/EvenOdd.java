package Lec2;
import java.util.Scanner;
public class EvenOdd {
	public static boolean checkEvenOdd(int n) {
		return n % 2 == 0;
	}
		
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean check = checkEvenOdd(n);
		System.out.print(check);
	}

}
