package arithmetic;

import java.util.Scanner;

public class Operation_Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a number ");

        double number = scanner.nextDouble();
        double square = number * number;

        System.out.println(" The square of number is "  + square);
    }
}
