package basicPrograms;

import java.util.Arrays;

public class MissingElement {

    public static int findMissingElement(int[] array) {
        System.out.println("Given Input array: " + Arrays.toString(array));

        int n = array.length + 1; //Since One element is Missing
        int expectedSum = (n * (n + 1)) / 2;  // Formula to calculate sum of first n natural numbers
        int actualSum = Arrays.stream(array).sum(); // Calculate the sum of the given array
        return expectedSum - actualSum; // The difference is the missing number

    }

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 6, 7, 8};
        int result = findMissingElement(array);
        System.out.println("Missing Element is: " + result);
    }
}
