package lesson_recap;

import java.util.Scanner;

public class task3_oddnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the a number");
        int x = scanner.nextInt();

        if(x % 2 == 0){
            System.out.println("It's a even number");

        }else{
            System.out.println("It's a odd number");
        }

    }
}
