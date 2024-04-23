import java.util.Scanner;

public static void main(String[] args) {
    //Create new object of Scanner Class
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    int num1 = input.nextInt();

    System.out.print("Enter the second number: ");
    int num2 = input.nextInt();
// Use Integer class and compare method to compare numbers
    switch (Integer.compare(num1, num2)) {
        case -1:
            System.out.println("Maximum Number is " + num2);
            break;
        case 0:
            System.out.println("Both numbers are equal");
            break;
        case 1:
            System.out.println("Maximum Number is " + num1);
            break;
        default:
            System.out.println("You have not entered a number");
    }
}