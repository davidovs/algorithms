package cf.b977;

/*
 * TODO description
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
