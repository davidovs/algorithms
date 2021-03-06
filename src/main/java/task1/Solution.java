package task1;

/**
 * Find all pairs for given summ
 *
 * Find all pairs for given summ and return them. Complexity must be O(n).
 * Example 1:
 * Input: {5, -3, 2, 7, -4, 0, 1}, sum = 12
 * Output: [{5, 7}]
 *
 * Example 2:
 * Input: {3,2,8,4,9,0,6,7}, sum = 10
 * Output: [{ ,}]
 */

// TODO make task returning unique Sets

import common.Pair;

import java.util.*;

public class Solution {

    // TODO check for the case {7, 2, 3}, summ = 14

    public List<Pair> execute(int[] array, long summ) {
        if (array == null || array.length < 2) {
            return Collections.emptyList();
        }

        List<Pair> result = new ArrayList<>();

        // TODO fix, use Value of map for this
        Map<Integer, Object> map = new HashMap();

        for (int i = 0; i < array.length; i++) {
            map.put(array[i], null);
        }

        long deltaLong;
        int deltaInt;

        for (int i = 0; i < array.length; i++) {
            deltaLong = summ - array[i];

            if (deltaLong < Integer.MIN_VALUE || deltaLong > Integer.MAX_VALUE) {
                continue;
            }

            deltaInt = (int) deltaLong;

            if (map.containsKey(deltaInt)) {
                result.add(Pair.of(array[i], deltaInt));
                map.remove(array[i]);
            }
        }

        return result;
    }
}
