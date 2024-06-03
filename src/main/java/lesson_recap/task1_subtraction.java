package lesson_recap;

import java.util.Scanner;

public class task1_subtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int x = scanner.nextInt();
        System.out.println("Enter the second number");
        int y = scanner.nextInt();

        int count = x/y;
        if( x<y){
            System.out.println("The first number should be greater than the second one ");
        }else{
            System.out.println("The result is: " + count);
        }





    }
}
