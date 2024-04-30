package lesson3;


import java.util.Scanner;

public class Task4_CalculateFactorial {
    public static void main(String[] args) {
        //Create new object of Scanner Class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a non-negative number");
//Collect user input using nextInt method
        int input = scanner.nextInt();
//check if input is <0
        if (input < 0) {
            System.out.println("Error, this is a negative number");
            // return to new try
            return;
        }
//Declare and initialize variables
        int i = 1;
        int factorial = 1;
//perform  loop that calculates the factorial of a number.
        while (i <= input) {
            factorial *= i;
            i++;
        }
        System.out.println("The factorial of " + input + " is " + factorial);


//        int a = 10;
//        int limit = 10;
//
//        while (a > 0) {
//            System.out.println(a + ",");
//            a--;
//        }
//
//        System.out.println();
    }
}
