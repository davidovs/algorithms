package hr.euler.p230;

/**
 * For any two strings of digits,  and , we define  to be the sequence (, , , , , ) in which each term is the concatenation of the previous two.
 *
 * Further, we define  to be the -th digit in the first term of  that contains at least  digits.
 *
 * Example:
 *
 * Let , . We wish to find , say.
 *
 * The first few terms of  are:
 *
 * Then  is the -th digit in the fifth term, which is .
 *
 * You are given  triples . For all of them find .
 *
 * Input Format
 *
 * First line of each test file contains a single integer  that is the number of triples. Then  lines follow, each containing two strings of decimal digits  and  and positive integer .
 *
 * Constraints
 *
 * Output Format
 *
 * Print exactly  lines with a single decimal digit on each: value of  for the corresponding triple.
 *
 * Sample Input
 * 2
 * 1415926535 8979323846 35
 * 1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679 8214808651328230664709384460955058223172535940812848111745028410270193852110555964462294895493038196 104683731294243150
 *
 * Sample Output
 * 9
 * 8
 */

import java.util.Scanner;

public class Solution {

    // TODO adopt to huge position

    public char execute(int q, String[][] array) {

        for (int i = 0; i < q; i++) {

            String str1 = array[i][0];
            String str2 = array[i][1];
            int position = Integer.parseInt(array[i][2]);

            String buf = str1 + str2;

//            System.out.println(String.format("%s %s %s", str1, str2, buf));

            if (buf.length() >= position) {
                return buf.charAt(position - 1);
            }

            do {

                str1 = new String(str2);
                str2 = new String(buf);
                buf = str1 + str2;

//                System.out.println(String.format("%s %s %s", str1, str2, buf));
            } while (buf.length() < position);

            return buf.charAt(position - 1);
        }
        return 'e';
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int q = Integer.parseInt(scan.nextLine());

        String[][] array = new String[q][];

        for (int i = 0; i < q; i++) {
            String line = scan.nextLine();
            array[i] = line.split(" ");
        }

        scan.close();

        Solution solution = new Solution();
        System.out.println(solution.execute(q, array));
    }
}