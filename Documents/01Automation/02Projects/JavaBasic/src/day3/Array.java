package day3;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// Gọi Bài 1
		numStudents();

		// Gọi Bài 2 - Test printArray()
		System.out.println("\n=== Testing printArray() ===");

		// TC1: Mảng rỗng
		int[] emptyArray = new int[0];
		System.out.print("Empty array: ");
		printArray(emptyArray);

		// TC2: Mảng có 1 phần tử
		int[] oneElement = new int[1];
		oneElement[0] = 2;
		System.out.print("One-element array: ");
		printArray(oneElement);

		// TC3: Mảng có nhiều phần tử
		int[] multipleElements = {1, 2, 3, 4, 5};
		System.out.print("Multi-element array: ");
		printArray(multipleElements);

		// TC4: float[]
		float[] floatArray = {1.1f, 2.2f, 3.3f};
		System.out.print("Float array: ");
		printArray(floatArray);

		// TC5: double[]
		double[] doubleArray = {5.5, 6.6, 7.7};
		System.out.print("Double array: ");
		printArray(doubleArray);
	}

	// Bài 1: Nhập điểm và tính trung bình
	public static void numStudents() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numStudents = scan.nextInt();

		int[] grades = new int[numStudents];
		int sum = 0;

		for (int i = 0; i < numStudents; i++) {
			int grade;
			while (true) {
				System.out.print("Enter the grade for student " + (i + 1) + ": ");
				grade = scan.nextInt();
				if (grade >= 0 && grade <= 100) {
					break;
				} else {
					System.out.println("Invalid grade, try again...");
				}
			}
			grades[i] = grade;
			sum += grade;
		}

		double average = (double) sum / numStudents;
		System.out.printf("The average is: %.1f\n", average);

		scan.close();
	}

	// Bài 2: printArray(int[])
	public static void printArray(int[] array) {
		if (array.length == 0) {
			System.out.println("Mảng chưa có phần tử nào");
			return;
		}

		System.out.print("{");
		for (int i = 0; i < array.length; i++) {
			if (i < array.length - 1) {
				System.out.print(array[i] + ", ");
			} else {
				System.out.print(array[i]);
			}
		}
		System.out.println("}");
	}

	// Overload: printArray(float[])
	public static void printArray(float[] array) {
		if (array.length == 0) {
			System.out.println("Mảng float chưa có phần tử nào");
			return;
		}

		System.out.print("{");
		for (int i = 0; i < array.length; i++) {
			if (i < array.length - 1) {
				System.out.print(array[i] + ", ");
			} else {
				System.out.print(array[i]);
			}
		}
		System.out.println("}");
	}

	// Overload: printArray(double[])
	public static void printArray(double[] array) {
		if (array.length == 0) {
			System.out.println("Mảng double chưa có phần tử nào");
			return;
		}

		System.out.print("{");
		for (int i = 0; i < array.length; i++) {
			if (i < array.length - 1) {
				System.out.print(array[i] + ", ");
			} else {
				System.out.print(array[i]);
			}
		}
		System.out.println("}");
	}
	public static String arrayToString(int[] array) {
		if(array.length == 0) return "{}";
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		
		for(int i = 0; i<array.length; i++) {
			sb.append(array[i]);
			if(i<array.length - 1) {
				sb.append(",");
			}
		}
		sb.append("}");
		return sb.toString();
		
		
	}
	
	
	
	
	
	
}
