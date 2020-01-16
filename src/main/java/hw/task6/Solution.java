package hw.task6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Verify if two lists contain same integers same times
 */
public class Solution {

    public boolean execute(List<Integer> list1, List<Integer> list2) {
        if (list1 == list2) {
            return true;
        }

        if (list1 == null || list2 == null) {
            return false;
        }

        if (list1.size() != list2.size()) {
            return false;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (Integer element : list1) {
            Integer count = map.getOrDefault(element, 0);
            map.put(element, count + 1);
        }

        for (Integer element : list2) {
            Integer count = map.getOrDefault(element, 0);
            map.put(element, count - 1);
        }

        for (Integer key : map.values()) {
            if (key != 0) {
                return false;
            }
        }

        return true;
    }
}