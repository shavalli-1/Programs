package basicPrograms;

import java.util.Arrays;

public class LargestElement {


    public static int findLargestElement(int[] array) {

        System.out.println("Input Array: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));

        int max = array[0];
        for (int ar : array) {
            if (ar > max) max = ar;
        }
        return max;

    }

    public static void main(String[] args) {
        int[] array = {2, 4, 5, 6, 2};
        System.out.println(findLargestElement(array));
    }
}
