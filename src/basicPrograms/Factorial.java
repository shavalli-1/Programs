package basicPrograms;

public class Factorial {

    public static void main(String[] args) {
        int loopNumber = 5, factorial = 1;

        for (int i = 1; i <= loopNumber; i++) {
         factorial = factorial * i;
        }
        System.out.println(factorial);
    }


}
