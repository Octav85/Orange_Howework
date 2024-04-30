package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ScannerArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values");

        int[] nr = new int[4];

        for (int i = 0; i < nr.length; i++) {

            nr[i] = scanner.nextInt();


        }

        System.out.println(nr.length);
        System.out.println("Contents of the array: " + Arrays.toString(nr));

    }
}
