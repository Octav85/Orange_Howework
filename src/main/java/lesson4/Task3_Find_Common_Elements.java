package lesson4;

public class Task3_Find_Common_Elements {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 7, 9, 10};
        int[] arr2 = {3, 12, 9, 10, 22};

// perform the loop for both arrays, compare the elements and print common elements from one of arrays
        System.out.println("The common elements from  these 2 arrays are:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr2[j] == arr1[i]) {
                    System.out.println(arr2[j]);
                }


            }


        }
    }
}




//        if(arr1[i] == arr2[j]){
//
