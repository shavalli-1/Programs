package basicPrograms;

public class GCD {


    public static int findGCD(int number1, int number2) {
        int gcd = 1;
        for (int i = 2; i <= Math.min(number1, number2); i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        int number1 = 101, number2 = 103;

        int result = findGCD(number1, number2);
        System.out.println(result);
    }
}
