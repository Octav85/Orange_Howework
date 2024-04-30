package lesson4;

import java.util.*;

public class Task1_Reverse_Elements_Array {
    public static void main(String[] args) {
        int[] numbers = {1, 9, 7, 5, 18, 58};
        // declare new array to collect reversed integers from array above
        int[] reversedNumbers = new int[numbers.length];
        /* perform a loop to go through the array from end to beginning and populate the second array from beginning */
        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {
            reversedNumbers[j] = numbers[i];
        }
        System.out.println(Arrays.toString(reversedNumbers));
    }
}

