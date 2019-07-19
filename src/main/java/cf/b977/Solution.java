package cf.b977;

/**
 * B. Two-gram
 * time limit per test1 second
 * memory limit per test256 megabytes
 * inputstandard input
 * outputstandard output
 * Two-gram is an ordered pair (i.e. string of length two) of capital Latin letters. For example, "AZ", "AA", "ZA" — three distinct two-grams.
 *
 * You are given a string s consisting of n capital Latin letters. Your task is to find any two-gram contained in the given string as a substring (i.e. two consecutive characters of the string) maximal number of times. For example, for string s = "BBAABBBA" the answer is two-gram "BB", which contained in s three times. In other words, find any most frequent two-gram.
 *
 * Note that occurrences of the two-gram can overlap with each other.
 *
 * Input
 * The first line of the input contains integer number n (2≤n≤100) — the length of string s. The second line of the input contains the string s consisting of n capital Latin letters.
 *
 * Output
 * Print the only line containing exactly two capital Latin letters — any two-gram contained in the given string s as a substring (i.e. two consecutive characters of the string) maximal number of times.
 *
 * Examples
 * inputCopy
 * 7
 * ABACABA
 * outputCopy
 * AB
 * inputCopy
 * 5
 * ZZZAA
 * outputCopy
 * ZZ
 * Note
 * In the first example "BA" is also valid answer.
 *
 * In the second example the only two-gram "ZZ" can be printed because it contained in the string "ZZZAA" two times.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    public String execute() {
        return "TODO";
    }

    // TODO check main1 and main2

    public void main1(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.next());

        String string = scanner.next();

        for (int i = 0; i < n - 1; i++) {
            String substring = string.substring(i, i + 2);

            System.out.println("!!!!!!! " + substring);

            Integer value = map.get(substring);

            if (value == null) {
                map.put(substring, 1);
            } else {
                map.put(substring, value + 1);
            }
        }

        String resultSubString = "";
        Integer resultCounter = 0;

        for (String substring : map.keySet()) {
            Integer value = map.get(substring);

            if (resultCounter < value) {
                resultCounter = map.get(substring);
                resultSubString = substring;
            }
        }

        System.out.print(resultSubString);
    }

    public void main2(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.next());

        String string = scanner.next();

        for (int i = 0; i < n - 1; i++) {
            String substring = string.substring(i, i + 2);

            System.out.println("!!!!!!! " + substring);

            Integer value = map.get(substring);

            if (value == null) {
                map.put(substring, 1);
            } else {
                map.put(substring, value + 1);
            }
        }

        String resultSubString = "";
        Integer resultCounter = 0;

        for (String substring : map.keySet()) {
            Integer value = map.get(substring);

            if (resultCounter < value) {
                resultCounter = map.get(substring);
                resultSubString = substring;
            }
        }

        System.out.print(resultSubString);
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