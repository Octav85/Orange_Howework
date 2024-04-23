package lesson4;

import java.util.Arrays;

public class Task6_Merge2Arrays {
    public static void main(String[] args) {
        int[] arr1 = {12, 7, 9, 6};
        int[] arr2 = {17, 8, 21, 19};
        //declare 3rd array concatenating the length of 2 first arrays
        int[] arr3 = new int[arr1.length+ arr2.length];
// Sort first 2 arrays by using sort method
        Arrays.sort(arr1);
        Arrays.sort(arr2);
//Populate 3 rd array with elements from 1st array
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
            }
        //populate 3rd array with elements from 2nd array right at the position where elements from 1st array are ending
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length +i ] = arr2[i];
        }
        //Sort the 3rd array
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}
