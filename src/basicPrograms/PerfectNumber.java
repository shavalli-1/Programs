package basicPrograms;

public class PerfectNumber {
    /*A perfect number is a positive integer equal to the sum of its proper divisors,
    excluding the number itself. For instance, the number 6 is a perfect number
    because its divisors (1, 2, and 3) add up to 6: */
    public static void isPerfectNumber(int number) {
        System.out.println("Given Input Number is: " + number);
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }

        }
        if (sum == number) System.out.println("Yes, It is a PerfectNumber");
        else System.out.println("NO, It is not a PerfectNumber");
    }

    public static void main(String[] args) {
        int number = 8;
        isPerfectNumber(number);
    }
}
