package basicPrograms;

public class Palindrome_Interview {

    public static void isPalindrome(String string){

        StringBuilder reverseString = new StringBuilder(string).reverse();

        String result = reverseString.toString();

        if(result.equals(string)){
            System.out.println("Yes! it is a palindrome");
        }
        else{
            System.out.println("No, It's not a palindrome");
        }
    }

    public static void main(String[] args) {
        String string = "madam";
        isPalindrome(string);


    }
}
