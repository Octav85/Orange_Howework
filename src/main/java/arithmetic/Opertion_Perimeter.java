package arithmetic;

import java.util.Scanner;

public class Opertion_Perimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");

        double number = scanner.nextDouble();
        double perimeter =  4 * number;

        System.out.println("The perimeter of square is: " + perimeter);
    }
}
