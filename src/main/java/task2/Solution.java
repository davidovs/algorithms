package task2;

/*
 * Find first absent natural number
 *
 * Find first absent natural number and return it. Complexity must be O(n), memory O(1).
 * Example:
 * Input: {5, -3, 2, 7, -4, 0, 1}
 * Output: 3
 */

public class Solution {

    private static final int DEFAULT_RESULT = 1;

    private int search(int[] array) {
        if (array == null) {
            return DEFAULT_RESULT;
        }

        int result;

        // 1 .. array.length
        int position = 1;

        int buffer;

        while (position <= array.length) {
            if (array[position - 1] <= 0 || array[position - 1] > array.length) {

            }

        }

        validate(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                return i + 1;
            }
        }

        throw new RuntimeException("Algorithm is incorrect.");
    }

    private void validate(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[i] != i + 1) {
                throw new RuntimeException("Algorithm is incorrect.");
            }
        }
    }

    public void runSearch() {
        int[] array = {5, -3, 2, 7, -4, 0, 1};

        System.out.println(search(array));
    }
}
