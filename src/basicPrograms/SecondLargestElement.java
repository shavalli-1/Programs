package basicPrograms;

import java.util.Arrays;

public class SecondLargestElement {

/*How it works:
We initialize two variables, largest and secondLargest, with the smallest possible integer value (Integer.MIN_VALUE).

We iterate through the array and:

If the current element is greater than largest, we update secondLargest to be the current largest, and then update largest with the new larger value.
If the current element is smaller than largest but greater than secondLargest, we update secondLargest.
If there is no second largest element (e.g., if the array contains only one unique element), the program will return Integer.MIN_VALUE and handle the case accordingly.
*/

    public static int findSecondLargestElement(int[] array) {
        System.out.println("Given Input array: " + Arrays.toString(array));

        int largestElement = Integer.MIN_VALUE;
        int secondLargestElement = Integer.MIN_VALUE;

        for (int element : array) {
            if (element > largestElement) {
                secondLargestElement = largestElement;
                largestElement = element;
            } else if (element > secondLargestElement && element != largestElement) {
                secondLargestElement = element;
            }

        }
        return secondLargestElement;


    }

    public static void main(String[] args) {
        int[] array = {1, 34, 5, 43, 5, 4, 9, 35};
        int result = findSecondLargestElement(array);
        System.out.println("Second Largest Element is: " + result);
    }
}
