package homework_collections;

import java.util.Comparator;

public  class Product implements Comparable<Product> {
    private String name;
    public String category;
    private double price;


    public Product(String name, String category, double price) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double price() {
        return price;
    }

    public String getCategory() {
        return category;


    }

    @Override
    public String toString() {
        return "Product{" +
               "name='" + name + '\'' +
               ", category='" + category + '\'' +
               ", price=" + price +
               '}';

    }

    public int compareTo(Product other) {
        return this.name.compareTo(other.name);

    }

}





