package homework_collections;

import java.util.*;

public class Task3_ToyStore {
    Map<String, Product> toyStore = new HashMap<>();




    public void addProduct(String name, Product product) {
        toyStore.put(name, product);
    }

    public void printEntries() {
        System.out.println("Printing entries");
        for (Map.Entry<String, Product> entry : toyStore.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
    }

    public void printNames() {
        System.out.println("Printing the names");
        for (String name : sortedNames()) {
            System.out.println(name);
        }
    }

    public Set<Map.Entry<String, Product>> sortedEntries() {
        return new TreeSet<>(toyStore.entrySet());
    }

    public Set<String> sortedNames() {
        return new TreeSet<>(toyStore.keySet());
    }

    public Collection<Product> sortedValues() {
        return new TreeSet<>(toyStore.values());
    }
}