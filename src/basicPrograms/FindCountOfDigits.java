package basicPrograms;

public class FindCountOfDigits {

    public static int countDigits(int input) {
        if (input <= 0) return 0;

        input = Math.abs(input);

        int count = 0;

        while (input > 0) {
            count++;
            input = input / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int input = 7586458;

        System.out.print(countDigits(input));
    }
}
