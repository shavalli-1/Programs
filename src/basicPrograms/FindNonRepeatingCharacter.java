package basicPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindNonRepeatingCharacter {

    public static void findNonRepeatingCharacter(String string) {


        Map<Character, Integer> charMap = new LinkedHashMap<>();

        for (char ch : string.toLowerCase().toCharArray()) {
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("The first non-repeating character is: " + entry.getKey());
                break;
            }
        }

    }

    public static void main(String[] args) {
        //String string = "Swiss";
        // findNonRepeatingCharacter(string);

        String[] testCases = {
                "Swiss",
                "abacabad",
                "character",
                "aabbcc",
                "a",
                "",
                "swiSS",
                "AaBbCc",
                "abcdeedcba",
                "abcdefghijklmnopqrstuvwxyzyxwvutsrqponmlkjihgfedcba"
        };

        for (String testCase : testCases) {
            System.out.println("Testing input: " + testCase);
            findNonRepeatingCharacter(testCase);
        }
    }
}
