package basicPrograms;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    // removing Duplicate values from the array

    public static void removeIntArrayDuplicates(int[] integerArray) {
        System.out.println("Input with Duplicates: " + Arrays.toString(integerArray));
        LinkedHashSet<Integer> linkedIntSet = new LinkedHashSet<>();

        for (int set : integerArray) {
            linkedIntSet.add(set);
        }
        int[] array = linkedIntSet.stream().mapToInt(Integer::intValue).toArray();

        /*
         * When to Use toString(): If you simply need a string representation for logging or displaying the contents to users without needing to manipulate the data further, using toString() suffices.

When to Convert to an Array: If you plan to perform further numerical operations, computations, or manipulations on the unique integers (like sorting, filtering, etc.), converting the LinkedHashSet into an array is essential.
         */

        // System.out.println("Input after removing Duplicates: " + linkedIntSet.toString());
        System.out.println("Input after removing Duplicates: " + Arrays.toString(array));

    }


    // removing Duplicate characters from String

    public static void removeStringCharacterDuplicates(String string) {
        System.out.println("Given Input String: " + string);
        LinkedHashSet<Character> stringSet = new LinkedHashSet<>();
        for (char ch : string.toCharArray()) {
            stringSet.add(ch);
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (char ch : stringSet) {
            stringBuilder.append(ch);
        }
        System.out.println("After removing Dupicates: " + stringBuilder.toString());


    }

    //removing Duplicates using Streams


    public static void removeDuplicatesWithStreams(List<Integer> intList) {
        System.out.println("Input is: " + intList);
        List<Integer> numbers = intList;
        List<Integer> result = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("Result is: " + result);

    }

    public static void main(String[] args) {

        //int[] integerArray = {1, 3, 3, 3, 4, 4, 5, 3, 35, 9, 2};

        List<Integer> integerList = Arrays.asList(1, 3, 3, 3, 4, 4, 5, 3, 35, 9, 2);

        // String string = "geeksforgeeks";

        //removeIntArrayDuplicates(integerArray);
        //removeStringCharacterDuplicates(string);

        removeDuplicatesWithStreams(integerList);

    }
}
