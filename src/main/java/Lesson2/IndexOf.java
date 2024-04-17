package Lesson2;

public class IndexOf {
    public static void main(String[] args) {
        // Create a string variable named "text" with the value "I love Java"
        String text = "I love Java";

        // Print the index of the letter 'J' in the string
        System.out.println("Index of 'J' is " + text.indexOf("J"));

        // Print the original string followed by " and QA Automation "
        System.out.println(text + " and QA Automation ");

        // Check if the entire string is considered a String
        boolean isString = text.getClass() == String.class;
        System.out.println("Is this text a string ? : " + isString);

    }
}
