package day1;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		
        //  Bài 1: Toán tử ba ngôi
        int x = 20;
        String sup = (x < 15) ? "small" : (x < 22) ? "tiny" : "huge";
        System.out.println("Bài 1 output: " + sup); 

        //  Bài 2: Tính tốc độ
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input distance in meters: ");
        float distance = scanner.nextFloat();

        System.out.print("Input hour: ");
        int hours = scanner.nextInt();

        System.out.print("Input minutes: ");
        int minutes = scanner.nextInt();

        System.out.print("Input seconds: ");
        int seconds = scanner.nextInt();

        // Chuyển toàn bộ thời gian về giây
        int totalSeconds = hours * 3600 + minutes * 60 + seconds;

        // Tính vận tốc
        float speedMps = distance / totalSeconds;                     // meters per second
        float speedKmph = (distance / 1000) / (totalSeconds / 3600f); // km/h
        float speedMph = (distance / 1609f) / (totalSeconds / 3600f); // miles/h

        // In kết quả
        System.out.println("Your speed in meters/second is " + speedMps);
        System.out.println("Your speed in km/h is " + speedKmph);
        System.out.println("Your speed in miles/h is " + speedMph);

        scanner.close();
	}
}
