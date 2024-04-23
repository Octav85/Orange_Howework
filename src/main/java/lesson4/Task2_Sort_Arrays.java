package lesson4;

import java.util.Arrays;

public class Task2_Sort_Arrays {
    public static void main(String[] args) {
        int[] numbers = {1, 9, 7, 5, 18, 58};
//  call sort method oc class Array to sort the array
        Arrays.sort(numbers);
        System.out.println("Array is sorted by ascending order " + Arrays.toString(numbers));
//initialize new array with elements in descending order
        int[] descendingOrder = new int[numbers.length];
//Run the loop to populate 2nd array with elements from the end of first array
        for (int i = 0; i < numbers.length; i++) {
            descendingOrder[i] = numbers[numbers.length - 1 -i];

        }
        System.out.println("Array is sorted by descending order " + Arrays.toString(descendingOrder));

    }
}
