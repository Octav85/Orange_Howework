package Lesson2;

import java.util.Scanner;

public class Comparisions2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year:");

        int year = scanner.nextInt();
        // check whether LeapYear is true by dividing year to 4 or and not dividable to 100
        // or dividable to 400
        boolean isLeapYear = (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
