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

    public int execute(int[] array) {
        if (array == null) {
            return DEFAULT_RESULT;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 || array[i] > array.length) {
                array[i] = 0;
            }
        }

        // 1 .. array.length
        int position = 1;

        int leftValue;

        int rightValue;

        while (position <= array.length) {
            leftValue = array[position - 1];

            if (leftValue == 0 || leftValue == position) {
                position++;
                continue;
            }

            rightValue = array[leftValue - 1];

            if (rightValue == 0 || rightValue == leftValue) {
                 array[leftValue - 1] = leftValue;
                 array[position - 1] = 0;
                 position++;
            } else {
                array[leftValue - 1] = leftValue;
                array[position - 1] = rightValue;
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
}
