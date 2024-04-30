package lesson2;

import java.util.Scanner;

public class ConditionalOperations {
    public static void main(String[] args) {
        //import Class Scanner and create scanner object to read input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
//read the input number
        int number = scanner.nextInt();
        //create a condition to check whether the number is positive or not
        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative");

        } else
            System.out.println("This is 0");
    }
}
