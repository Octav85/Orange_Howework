package homework_collections;

import java.util.*;

public class Task2_RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer>numbers = Arrays.asList(1,2,3,4,4,5);
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        List<Integer>result = new ArrayList<>(uniqueNumbers);

        for( Integer num: result){
            System.out.print(num + " ");
        }


    }



}
