package basicPrograms;

/*Reverse an array*/
public class AverageOfNumbers {

    private static void findAverageOfArray(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double result = (double) sum / array.length;

        System.out.println(Math.round(result * 1000.0) / 1000.0);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 5, 8, 9};
        findAverageOfArray(array);
        // System.out.println("Hello World!!");
    }


}
