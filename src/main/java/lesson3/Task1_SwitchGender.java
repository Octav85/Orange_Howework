package lesson3;

import java.util.Scanner;

public class Task1_SwitchGender {
    public static void main(String[] args) {
//Create scanner object and print first message
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the gender m/f :");
//initialize gender object. Call Character class. Collect first char from user input
        char gender = Character.toLowerCase(scanner.next().charAt(0));
//Switch the gender. Print the message
        switch (gender) {
            case 'm':
                System.out.println("The chosen gender is Male");
                break;

            case 'f':
                System.out.println("The chosen gender is Female");
                break;

            default:
                System.out.println("The gender is not defined");

        }
        //Close the scanner
        scanner.close();
    }
}
