package basicPrograms;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Random;

public class FactorialRecursion {

    public static int factorialOf(int number) {
        if (number == 0)
            return 1;

        return (number * factorialOf(number - 1));

    }

    public static void main(String[] args) {
        int result = factorialOf(5);

        Random random = new Random();
            random.nextInt(100);
        System.out.println(random.nextInt());
        //System.out.println(result);
    }
}

