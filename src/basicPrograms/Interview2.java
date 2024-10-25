package basicPrograms;

import java.util.*;

public class Interview2 {


    /* take a list of numbers 10,20,30,40,50,60,70
    the number which is less than 50 that should be multiplied with 2 and then
     */




    /*
     * Take a list of Strings and count no of vowels in the each element in the given array.
     *
     */


    public static Map<String, Map<String, Integer>> findVowelsInElement(List<String> inputStringList) {


        Map<String, Map<String, Integer>> stringIntegerMap = new LinkedHashMap<>();

        for (String str : inputStringList) {
            int vowels = 0, consonants = 0;

            for (char ch : str.toCharArray()) {
                if ("aeiouAEIOU".indexOf(ch) != -1) {
                    vowels++;
                } else if (Character.isLetter(ch)) {
                    consonants++;
                }
            }

            Map<String, Integer> countMap = new LinkedHashMap<>();
            countMap.put("Vowels", vowels);
            countMap.put("Consonants", consonants);
            stringIntegerMap.put(str, countMap);
        }
        return stringIntegerMap;
    }


    public static void main(String[] args) {

        List<String> listOfString = Arrays.asList("Harsha", "Shavalli", "Faizan", "Arfaz");
        Map<String, Map<String, Integer>> result = findVowelsInElement(listOfString);
        System.out.println(result);


    }


}
