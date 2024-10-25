package basicPrograms;

public class PascaleTriangle {

    public static void printPascaleTriangle(int rows) {

        //first loop traverse till the no of rows given in the input

        for (int i = 0; i < rows; i++) {
            int number = 1;  // we are starting with the number from 1
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            /* this is used for handling the leading spaces,
                 as the 'i' value increases leading spaces should get decreased.*/

            for (int j = 0; j <= i; j++) {
                //looping till the i value exists to print the triangle
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1); //calculating the numbers to print
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        printPascaleTriangle(5);
    }
}
