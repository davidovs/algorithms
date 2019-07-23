package task5;

/**
 * Check if an integer is a palindrome.
 */

import java.util.Scanner;

public class Solution {

    public boolean execute(int x) {
        int buf = x;
        int y = 0;

        while (buf > 0) {
            y = y * 10 + buf % 10;
            buf /= 10;
        }

        return x == y;
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