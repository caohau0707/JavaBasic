package day1;

import java.util.Scanner;

public class DecisionMaking {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Bài 1: Tính tổng chữ số
		System.out.print("Input an integer between 0 and 1000: ");
		int n = scanner.nextInt();

		if (n <= 0 || n >= 1000) {
			System.out.println("Invalid input. Number must be > 0 and <1000.");
		} else {
			int result = tinhTong(n);
			System.out.println("The sum of all digits in " + n + " is " + result);
		}

		// Bài 2: Đổi phút sang năm và ngày
		System.out.print("\nInput the number of minutes: ");
		long minutes = scanner.nextLong();

		convertMinutes(minutes); // gọi method riêng xử lý

		scanner.close();
	}

	// Method cho bài 1
	public static int tinhTong(int n) {
		int sum = 0;
		sum += n / 100;
		sum += (n % 100) / 10;
		sum += n % 10;
		return sum;
	}

	// Method cho bài 2
	public static void convertMinutes(long minutes) {
		final int MINUTES_IN_DAY = 1440;
		final int MINUTES_IN_YEAR = 525600; // 365 * 1440

		long years = minutes / MINUTES_IN_YEAR;
		long days = (minutes % MINUTES_IN_YEAR) / MINUTES_IN_DAY;

		System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
	}
}
