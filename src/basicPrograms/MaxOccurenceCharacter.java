package basicPrograms;

import java.util.HashMap;
import java.util.Map;

public class MaxOccurenceCharacter {


    public static void findMaxOccurenceCharacter(String stringInput) {
        System.out.println("Given Input string: "+ stringInput);
        char maxOccurenceChar = ' ';
        int countOfOccurence = 0;
        Map<Character, Integer> charMap = new HashMap<>();

        char[] charArray = stringInput.toCharArray();

        for (Character ch : charArray) {
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() > countOfOccurence) {
                maxOccurenceChar = entry.getKey();
                countOfOccurence = entry.getValue();
            }

        }
        System.out.println("MaxOccurenceCharacter in input: " + maxOccurenceChar + " and it's count is : " + countOfOccurence);


    }



    public static void main(String[] args) {
        String stringInput = "character";
        findMaxOccurenceCharacter(stringInput);
    }
}
