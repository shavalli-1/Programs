package basicPrograms;

public class ArmstrongNumber {

//armstrong number 257 = 2^3+5^3+7^3=257 then it is the armstrong number;
//another comment.

    public static void findIsArmstrong(int number) {
        if (number < 0) throw new IllegalArgumentException("Please enter the number greater than zero");

        int countOfDigits = String.valueOf(number).length();
        int temp = number;
        int sum = 0;

        while (number > 0) {

            int digit = number % 10;

            sum = (int) (sum + Math.pow(digit, countOfDigits));

            number = number / 10;
        }

        if (temp == sum) {
            System.out.println("yes, given number is an armstrong number");
        } else
            System.out.println("No! given number is not an armstrong number");


    }


    public static void main(String[] args) {
        int number = -1;
        findIsArmstrong(number);
    }
}
