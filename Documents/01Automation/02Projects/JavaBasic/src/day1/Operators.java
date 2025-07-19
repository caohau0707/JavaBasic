package day1;

import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bài 1: Toán tử ba ngôi
        int x = 20;
        String sup = (x < 15) ? "small" : (x < 22) ? "tiny" : "huge";
        System.out.println("Bài 1 output: " + sup); 

        // Bài 2: Tính tốc độ
        System.out.print("\nInput distance in meters: ");
        float distance = scanner.nextFloat();

        System.out.print("Input hour: ");
        int hours = scanner.nextInt();

        System.out.print("Input minutes: ");
        int minutes = scanner.nextInt();

        System.out.print("Input seconds: ");
        int seconds = scanner.nextInt();

        int totalSeconds = hours * 3600 + minutes * 60 + seconds;

        float speedMps = distance / totalSeconds;
        float speedKmph = (distance / 1000) / (totalSeconds / 3600f);
        float speedMph = (distance / 1609f) / (totalSeconds / 3600f);

        System.out.println("Your speed in meters/second is " + speedMps);
        System.out.println("Your speed in km/h is " + speedKmph);
        System.out.println("Your speed in miles/h is " + speedMph);

        // Bài 3: Tính toán với 2 số nguyên
        System.out.print("\nInput 1st integer: ");
        int a = scanner.nextInt();

        System.out.print("Input 2nd integer: ");
        int b = scanner.nextInt();

        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        double average = (a + b) / 2.0;
        int distanceDiff = Math.abs(a - b);
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        System.out.println("Sum of two integers: " + sum);
        System.out.println("Difference of two integers: " + diff);
        System.out.println("Product of two integers: " + product);
        System.out.printf("Average of two integers: %.2f\n", average);
        System.out.println("Distance of two integers: " + distanceDiff);
        System.out.println("Max integer: " + max);
        System.out.println("Min integer: " + min);
        
        //Bai 4 tách một số nguyên thành từng chữ số riêng biệt
        System.out.println("input six non-negative digits: ");
        int number = scanner.nextInt();
        String numberString = String.valueOf(number);
        
        System.out.println("Expected Output:\n");
        for (int i = 0; i < numberString.length(); i++) {
            System.out.print(numberString.charAt(i) + " ");
        } 

        scanner.close();
    }
}
