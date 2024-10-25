package basicPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaPrograms {


    public static void main(String[] args) {

       // List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        //String searchSubstring = "an";

        /* Use a lambda expression with anyMatch to check for substring presence
//        boolean isSubstringPresent = strings.stream()
//                .anyMatch(s -> s.contains(searchSubstring)); */

        // strings.stream().map(String::length).forEach( element -> System.out.println("length" + element));
        String str = "unhappy";
        String subStr = str.substring(1); // Extracts "World"
        System.out.println("Substring: " + subStr);
        // Print the result
        //System.out.println("Is any string in the list contain substring '" + searchSubstring + "'? " + isSubstringPresent);
    }
}




