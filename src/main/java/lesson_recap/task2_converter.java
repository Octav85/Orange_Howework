package lesson_recap;

import java.util.Scanner;

public class task2_converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value in celsius");
        int celsius = scanner.nextInt();

        double fahrenheit= (celsius * 1.8)+ 32;
        System.out.println("The temperature in fahrenheit is: " + fahrenheit);
    }
}
