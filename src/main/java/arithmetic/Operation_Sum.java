package arithmetic;

import java.util.Scanner;

public class Operation_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");

        int number = scanner.nextInt();
        int sum = number + number;
        System.out.println("The sum is: " + sum);

        int product = number * number;
        System.out.println("The product of number is: "  + product);


    }
}
