package interviewQuestions;

import java.util.Arrays;

public class Ns_Questions {


    public static int[] removeDuplicates(int[] array) {

        int n = array.length;

        // Check if the array has 0 or 1 element (in which case it's already unique)

        if (n == 0 || n == 1) return array;


        // Temp array to store unique elements

        int[] temp = new int[n];

        int j = 0;

        // Traverse the array, comparing each element with the next one

        for (int i = 0; i < n - 1; i++) {
            if (array[i] != array[i + 1]) {
                temp[j++] = array[i];
            }
        }

        // Add the last element

        temp[j++] = array[n - 1];

        // Create a new array of the correct size to return

        int[] result = new int[j];

        // Copy elements from temp to result

        for (int i = 0; i < j; i++) {
            result[i] = temp[i];
        }
        return result;
    }


    public static void main(String[] args) {
        int[] array = {1, 4, 5, 7, 7, 9, 8, 8, 2, 4};
        int[] result = removeDuplicates(array);
        System.out.println(Arrays.toString(result));
    }
}
