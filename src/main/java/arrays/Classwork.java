package arrays;

public class Classwork {
    public static void main(String[] args) {
        int[] array1 = {13, 3, 5, 9, 1, 2};
        int[] array2 = {1, 2, 6, 7, 81, 3};
        int max = array1[0];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
  //              System.out.println("The sum of arrays");
   //             System.out.println(array1[i] + array2[i]);
                max = Math.max(max, array1[i]);



            }
        }System.out.println(max);

    }

}
