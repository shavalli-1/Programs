package interviewQuestions;

public class PairOfElements {

    public static void findPairs(int[] array, int target) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println("Pair: (" + array[i] + ", " + array[j] + ")");
                }

            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 7, 8, 5, 9, 5, 5, 3};
        int target = 5;

        findPairs(array, target);

    }
}
