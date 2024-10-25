package interviewQuestions;

import java.util.*;
import java.util.stream.IntStream;

public class epamQuestion {


    public static void mergeIntoSingleArrayWithSorted(int[] array1, int[] array2) {

        /* using built in functions
        int[] mergedArray = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).toArray();
        Arrays.sort(mergedArray);
        System.out.println("Merged Array With Sorted elements: " + Arrays.toString(mergedArray));
        */


        // Sort both arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        int[] mergedArray = new int[array1.length + array2.length];

        int i = 0, j = 0, k = 0;

       // Merge arrays in a sorted manner
        while (i < array1.length && j < array2.length) {
            if (array1[i] <= array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }

        // Copy remaining elements from array1, if any
        while (i < array1.length) {
            mergedArray[k++] = array1[i++];
        }

        // Copy remaining elements from array2, if any
        while (j < array2.length) {
            mergedArray[k++] = array2[j++];
        }
        System.out.println("Merged Array With Sorted elements: " + Arrays.toString(mergedArray));

    }

    public static void main(String[] args) {
        int[] array1 = {1, 8, 9, 7, 4, 2};
        int[] array2 = {8, 1, 9, 2, 3, 5};
        mergeIntoSingleArrayWithSorted(array1, array2);
    }
}
