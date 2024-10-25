package basicPrograms;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public static int findLongestSubstring(String string) {
        int maxLength = 0;
        for (int i = 0; i < string.length(); i++) {
            int length = 0;
            Set<Character> set = new HashSet<>();
            for (int j = i; j < string.length(); j++) {
                if (set.contains(string.charAt(j)))
                    break;
                set.add(string.charAt(j));
                length++;
            }
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;


    }


    public static void main(String[] args) {

        String input = "ABDEFGABEF";
        int result = findLongestSubstring(input);
        System.out.println("Result of length of the substring is: " + result);
    }
}
