package basicPrograms;

import javax.swing.*;

public class ReverseString {

    public static void reverseString(String string) {

        StringBuilder stringBuilder = new StringBuilder(string);
        String result = stringBuilder.reverse().toString();
        System.out.println(stringBuilder);

    }


    public static void main(String[] args) {
        String string = "shavalli";
        reverseString(string);
    }
}
