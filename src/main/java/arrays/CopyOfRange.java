package arrays;

import java.util.Arrays;

public class CopyOfRange {
    public static void main(String[] args) {
        int arr [] = {2,5,6,2,5,6};
        int copy []= Arrays.copyOfRange( arr, 0,3);
        for( int i: copy)
            System.out.println("First array" +i );

        int copy1 [] = Arrays.copyOfRange(arr,3,6);
        for(int i: copy1)
            System.out.println("Second array" + i + "");

        int sum1=0;
        int sum2 =0;

        for(int i = 0; i < copy.length;i++){
            sum1 += copy[i];
            sum2 += copy1[i];
            System.out.println(sum1 == sum2);
        }


    }
}
