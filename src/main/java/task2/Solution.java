package task2;

import java.util.Scanner;

/**
 * Given an unsorted integer array, find the smallest missing positive integer.
 *
 * Example 1:
 * Input: [1, 2, 0]
 * Output: 3
 *
 * Example 2:
 * Input: [3, 4, -1, 1]
 * Output: 2
 *
 * Example 3:
 * Input: [7, 8, 9, 11, 12]
 * Output: 1
 *
 * Example 4:
 * Input: [5, -3, 2, 7, -4, 0, 1]
 * Output: 3
 *
 * Example 5:
 * Input: [1, 2, 3, 4]
 * Output: 5
 *
 * Example 6:
 * Input: [4, 3, 2, 1]
 * Output: 5
 *
 * Example 7:
 * Input: [1, -2, 3, -4]
 * Output: 2
 *
 * Example 8:
 * Input: [-4, -3, -2, -1]
 * Output: 1
 *
 * Example 9:
 * Input: [0, -3, 2, -1]
 * Output: 1
 *
 * Example 10:
 * Input: [2, 1, 2, 0]
 * Output: 3
 *
 * Note:
 *
 * Your algorithm should run in O(n) time and uses constant extra space.
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

        return array.length + 1;
    }

    private void validate(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[i] != i + 1) {
                throw new RuntimeException("Algorithm is incorrect.");
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO
        Solution solution = new Solution();
//        solution.execute()
        // TODO
    }
}