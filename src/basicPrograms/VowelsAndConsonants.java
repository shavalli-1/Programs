package basicPrograms;

public class VowelsAndConsonants {

    public static void main(String[] args) {
        String str = "ksfjasodfad";

        int vowels = 0, consonants = 0;
        StringBuilder vowelStr = new StringBuilder();
        StringBuilder consonantStr = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                vowelStr.append(ch);
                vowels++;
            } else if (Character.isLetter(ch)) {
                consonantStr.append(ch);
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowelStr + ",Count: " + vowels + ",Consonants: " + consonantStr + ",Count: " + consonants);


    }
}
