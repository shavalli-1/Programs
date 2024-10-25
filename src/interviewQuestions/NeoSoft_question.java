package interviewQuestions;

import java.sql.SQLOutput;

public class NeoSoft_question {


    public static void findGreatestElements(int[] array) {

        int max = array[0];

        for (int arr : array) {
            if (arr > max) {
                max = arr;
            }
        }
        System.out.println("Greatest Element in the array : " + max);
    }

    public static void findLeastElement(int[] array) {
        int min = array[0];
        for (int arr : array) {
            if (arr < min) {
                min = arr;
            }
        }
        System.out.println("SmallestElement in the array: " + min);

    }

    public static void main(String[] args) {

        //print greatest number in the array and smallest array
        int[] array = {1, 2, 3, 4, 5, 6, 7};
         //findGreatestElements(array);
        findLeastElement(array);
    }
}
