package lesson3;

import java.util.Scanner;

public class Task6_Calculate_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a non-negative number");

        int input = scanner.nextInt();
        if (input < 0) {
            System.out.println("Error, this is a negative number");
            return;
        }
        int i = 1;
        int sum = 0;

        while (i <= input) {
            sum += i;
            i++;
        }
        System.out.println("The sum of all numbers in range " + input + " is " + sum);
    }
}
