package day3;

import java.util.Scanner;

public class Method {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();

		boolean result = isOdd(n);
		if(result == true) {
			System.out.println("ODD");
		} else {
		System.out.println("EVEN");
		}
		
	}
	
	//Bai 1
	
	public static boolean isOdd (int n) {	
		return n%2 != 0;
		
	}
	

}
