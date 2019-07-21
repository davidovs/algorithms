package pe.p001;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

import java.util.Scanner;

public class Solution {

    public long execute(int a, int b, int top) {
        long sum = 0;
        for (int i = 1; i < top; i++) {
            if (i % a == 0 || i % b == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        scanner.close();

        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int top = Integer.parseInt(str[2]);

        Solution solution = new Solution();
        System.out.println(solution.execute(a, b, top));
    }
}