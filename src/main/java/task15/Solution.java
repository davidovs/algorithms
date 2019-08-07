package task15;

/**
 * Gaussian elimination
 * System of linear equations
 */

public class Solution {

    public double[] execute(int[][] a, int[] b) {
        if (a == null) {
            throw new IllegalArgumentException("a must not be null");
        }

        if (b == null) {
            throw new IllegalArgumentException("b must not be null");
        }

        if (a.length != b.length) {
            throw new IllegalArgumentException("the size of b must be equal to the size of a");
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] == null) {
                throw new IllegalArgumentException("a[i] must not be null");
            }

            if (a[i].length != a.length) {
                throw new IllegalArgumentException("a must be array of equal dimensions");
            }
        }

        double[] result = new double[b.length];

        // TODO


        return result;
    }
}

class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[][] a = {{1, 2}, {2, 1}};
        int b[] = {4, 5};

        double[] results = solution.execute(a, b);

        for (double result: results) {
            System.out.println(result);
        }
    }
}