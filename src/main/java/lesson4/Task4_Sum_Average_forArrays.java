package lesson4;

public class Task4_Sum_Average_forArrays {
    public static void main(String[] args) {
        int [] arr = { 1,8,14,48,51,9};
        int sum = 0;

// calculate sum by adding the element after running the loop
        for( int i = 0; i < arr.length;i++){
            sum += arr[i];

        }
        // calculate average
        double avg = sum / arr.length;
        System.out.println("Average of integers from this array is " + avg );
    }
}
