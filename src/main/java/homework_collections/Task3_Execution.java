package homework_collections;

import java.util.*;

public class Task3_Execution {
    public static void main(String[] args) {
Task3_ToyStore toyStore= new Task3_ToyStore();


        toyStore.addProduct("Spider man", new Product("Superheroes","boys", 18));
        toyStore.addProduct("Barbie", new Product("Ordinar", "girls", 20));
        toyStore.addProduct("Police Car", new Product("Cars", "boys", 16));

        toyStore.printEntries();
        System.out.println();
      toyStore.printNames();
        System.out.println();
       toyStore.sortedValues();
        toyStore.sortedNames();

    }




}
