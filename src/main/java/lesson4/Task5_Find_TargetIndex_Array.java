package lesson4;

public class Task5_Find_TargetIndex_Array {
    public static void main(String[] args) {
        int[] arr = {1, 8, 14, 48, 51, 9};
        // declare target element from array
        int target = 8;
        // declare index start with -1 as nonexistent
        int index = -1;
// run the loop and declare condition if element from array is equal to target
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
            }

        }
        if (index != -1) {
            System.out.println("The index for element " + target + "from this array is: " + index);
        } else {
            System.out.println("The index for element " + target + " from this array wasn't found");
        }


    }
}
