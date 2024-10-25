package basicPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class UniqueSum {

    public static int findUniqueElementsSum(List<Integer> input) {

        HashSet<Integer> set = new HashSet<>(input);

        return set.stream().mapToInt(Integer::intValue).sum();

    }


    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(1, 1, 25, 6, 98, 23, 5, 4, 4, 6);
        int result = findUniqueElementsSum(inputList);
        System.out.println("Result is: " + result);

    }
}

