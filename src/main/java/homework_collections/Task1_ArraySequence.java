package homework_collections;


public class Task1_ArraySequence {
    public static void main(String[] args) {
        int[] arr = sequence(10);

        System.out.println("First 10 elements of the sequence:");
        for (int element : arr) {
            System.out.print(element + ", ");
        }
    }
    public static int[] sequence(int n) {
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sequence[i] = i+1 ;
            } else {
                sequence[i] = -(i+1);
            }
        }
        return sequence;
    }
}
