package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Accenture_Question {
    /*
    Write a program to find the prime numbers from the given list of array using both the normal approach and using the
    streams.
    */


    public static void findPrimeNumbers(int[] arrayInput) {
        boolean isPrime = true;

        List<Integer> primeNumbers = new ArrayList<>();

        for (int num : arrayInput) {
            if (isPrime(num)) {
                primeNumbers.add(num);
                //System.out.println(num + " Is a primeNumber");
            }
        }
        System.out.println("List of PrimeNumbers from the given Input: " + primeNumbers);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arrayInput = {1, 3, 4, 5, 64, 58, 9};
        findPrimeNumbers(arrayInput);


        /*
        To find the prime numbers in a given array using streams.
        */

        List<Integer> primeNumbers = Arrays.stream(arrayInput)
                .filter(Accenture_Question::isPrime)
                .boxed()
                .collect(Collectors.toList());

        /*List<Integer> primeNumbers = Arrays.stream(arrayInput) // creates an IntStream
                .filter(Accenture_Question_Stream::isPrime) // operates on int elements
                .boxed() // converts IntStream to Stream<Integer>
                .collect(Collectors.toList()); // collects into List<Integer>
*/

        //System.out.println("PrimeNumbers figured out using streams : "+ primeNumbers);


        /*
        When working with primitive type streams in Java, such as IntStream, LongStream, or DoubleStream, the elements are of a primitive type (int, long, double).
        These primitive streams are efficient in terms of memory and performance. However, they don’t allow us to directly collect the elements into a collection of wrapper classes (e.g., List<Integer>).
        The boxed() method converts each element in a primitive stream to its corresponding wrapper class. For example, IntStream elements (int) are converted to Integer elements in a regular Stream<Integer>.
        This allows us to perform actions that require wrapper types, like collecting into a list of Integer objects.
        */
    }
}
