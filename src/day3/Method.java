package day3;

import java.util.Scanner;

public class Method {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 
		 //Bai 1
		boolean result = isOdd(n);
		if(result == true) {
			System.out.println("ODD");
		} else {
		System.out.println("EVEN");
		}
		
		//Bai 2
		boolean has8 = hasEight(n);
		if(has8) {
			System.out.println("The number contains digit 8");
		} else {
			System.out.println("The number does NOT contain digit 8");
		}
		
		//Bai 3
		magicSum();		
		sc.close();
		
	}
	
	//Bai 1
	
	public static boolean isOdd (int n) {	
		return n%2 != 0;
		
	}
	//Bai 2
	public static boolean hasEight(int number) {
		number = Math.abs(number);
		
		while (number > 0) {
			int digital = number %10;
			if(digital == 8) {
				return true;
			}
			number /=10;
		}
		return false;
	}
	
	//Bai 3
	public static void magicSum() {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		while (true) {
			System.out.println("Enter a positive integer or -1 to exit: ");
			int input = scanner.nextInt();
			if(input == -1) {
				break;
			}
			if(hasEight(input)) {
				sum += input;
			}			
			}
		System.out.println("\tThe magic sum is: " + sum);
	}
	

}
