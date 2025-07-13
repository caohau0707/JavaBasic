package day3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import org.openqa.selenium.By;

import graphql.org.antlr.v4.runtime.BailErrorStrategy;
import io.opentelemetry.api.metrics.DoubleCounter;

public class Loop {

	public static void main(String[] args) {
		printArray();
		sumAndAverage();
		SumAndAverageEx2();
		SumAndAverageEx3();
		SumAndAverageEx4();
		SumOfSquares();
		HarmonicSum();
		SquareBoard();
		CheckerBoard();
		FindCharacter();
	}
	//Bai 1
	
	public static void printArray() {
		byte[] numbers = new byte[5];
		numbers[0] = 1;
		numbers[1] = 3;
		numbers[2] = 5;
		numbers[3] = 8;
		numbers[4] = 9;
		
		
		for (byte i = 0; i < numbers.length; i++) {
			System.out.println("Phan tu thu " + (i+1) + " la: " + numbers[i]);
		}
	}
	//Bai 2
	
	public static void sumAndAverage() {
		int sum = 0;
		int count = 100;
		
		for(int i =1; i <= count; i++) {
			sum +=i;
		}
		float average = (float)sum/count;
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + average);
	}
	
	//Bai 3
	public static void SumAndAverageEx2() {
		int  sum= 0;
		int  count= 0;
		for (int i = 111; i<= 8899;i++) {
			sum +=i;
			count++;
		}
		System.out.println("The sum is " + sum);
		double average = (double)sum/(double) count;
		System.out.println("the average " + Math.round(average*100.0)/100.0);
	}
	//Bai 4
	public static void SumAndAverageEx3() {
		int sum = 0;
		int count = 0;
		for (int i = 1; i<=100; i++) {
			if(i%2==1) {
				sum=sum+i;
				count++;
			}
		}
		System.out.println("The sum 4 is " + sum);
	    double average = (double)sum / count;
		System.out.println("The average 4 " + Math.round(average*100.0)/100.0);
				
	}
	//Bai 5
	
	public static void SumAndAverageEx4() {
		int sum = 0;
		int count = 0;
		for (int i = 1; i<=100; i++) {
			if(i%7==0) {
				sum=sum+i;
				count++;
			}
		}
		System.out.println("The sum 5 is " + sum);
	    double average = (double)sum / count;
		System.out.println("The average 5 " + Math.round(average*100.0)/100.0);
				
	}
	
	//Bai 6
	public static void SumOfSquares() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i * i;
		}
		System.out.println("The sum of squares from 1 to 100 is: " + sum);
	}
	
	//Bai 7
	public static void HarmonicSum() {
		int n = 50000;
		double sumL2R = 0.0;
		double sumR2L = 0.0;
		
		//Tinh tu trai sang phai
		for(int i = 1; i<=n; i++) {
			sumL2R +=1.0/i;
		}
		//Tinh tu phai sang trai
		for (int i = n; i>= 1; i--) {
			sumR2L +=1.0/i;
		}
		 System.out.println("Harmonic sum from Left-to-Right: " + sumL2R);
		    System.out.println("Harmonic sum from Right-to-Left: " + sumR2L);

		    double diff = Math.abs(sumL2R - sumR2L);
		    System.out.println("Difference between two sums: " + diff);
	}
	
	//Bai 8
	public static void SquareBoard() {
	    int n = 5;
	    for (int row = 1; row <= n; row++) {
	        for (int col = 1; col <= n; col++) {
	            System.out.print("# ");
	        }
	        System.out.println(); // Xuống dòng sau mỗi hàng
	    }
	}

	//Bai 9
	public static void CheckerBoard() {
	    int n = 7;
	    for (int row = 1; row <= n; row++) {
	        if (row % 2 == 0) {
	            System.out.print(" ");
	        }

	        for (int col = 1; col <= n; col++) {
	            System.out.print("# ");
	        }
	        System.out.println();
	    }
	}
	//Bai 10
	public static void FindCharacter() {
		String input = "Hello World";
		char[] chars = input.toCharArray();
		int index = 0;
		int foundIndex = -1;
		
		while (index < chars.length) {
			if(chars[index] == 'r') {
				foundIndex = index;
				break;
			}
			index++;
		}
		if(foundIndex == -1) {
			System.out.println("Khong tim thay");
		} else {
			System.out.println("Ky tu 'r xua hien dau tien o vi tri: " + foundIndex);
		}
		
		
		
	}

	
	
	public static void doPractice() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Tong cua day so la: ");
		
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		

	}

}
