package lesson2;

import java.util.Scanner;

public class Comparisons {
    public static void main(String[] args) {
        //create scanner object to catch user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers");
// catch user input
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
 // using conditionals
        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " is the greatest number");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " is the greatest number");

        } else if(n3 > n1 && n3 > n2){
            System.out.println(n3 + " is the greatest number");

        }else{
            System.out.println("All numbers all the same");
        }

        // Using Math.max() to find the largest number
        double greatest = Math.max(n1, Math.max(n2,n3));
        System.out.println(greatest + " is the greatest number");

    }
}
