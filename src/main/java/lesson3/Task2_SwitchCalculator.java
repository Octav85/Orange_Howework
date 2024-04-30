package lesson3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2_SwitchCalculator {
    public static void main(String[] args) {
        //Declare 3 variables where the user input will be collected
        double number1;
        double number2;
        String operation;
//Create new object of Scanner class. Collect user input
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter first number: ");
            number1 = scanner.nextDouble();

            System.out.println("Enter the second number: ");
            number2 = scanner.nextDouble();

            System.out.println("Enter the operation (+, -, *, /): ");
            operation = scanner.next();
            // try/catch exception in case of input mismatch
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            //return to new input
            return;
        }
// Switch the operation. Print the result
        switch (operation) {
            case "+":
                System.out.println("The result is: " + (number1 + number2));
                break;
            case "-":
                System.out.println("The result is: " + (number1 - number2));
                break;
            case "*":
                System.out.println("The result is: " + (number1 * number2));
                break;
            case "/":
                if (number2 != 0.0) {
                    System.out.println("The result is: " + (number1 / number2));
                } else {
                    System.out.println("Error! Dividing by zero is not allowed.");
                }
                break;
            default:
                System.out.println("You have entered an invalid operator.");
                break;
        }
    }
}
