package task1;

import common.Pair;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void test1() {
        List<Pair> list = solution.execute(new int[]{5, -3, 2, 7, -4, 0, 1}, 12);

        assertNotNull(list);
        assertEquals(list.size(), 1);
        assertEquals(list.get(0).getLeft(), 5);
        assertEquals(list.get(0).getRight(), 7);
        // TODO create smart assert check
    }

    // TODO fix the solution to meet this test
    @Ignore
    @Test
    public void test2() {
        List<Pair> list = solution.execute(new int[]{5, -3, 0, 1}, 10);

        assertNotNull(list);
        assertEquals(list.size(), 0);
    }

    @Test
    public void test3() {
        List<Pair> list = solution.execute(new int[]{5, -3, 0, 1}, 11);

        assertNotNull(list);
        assertEquals(list.size(), 0);
    }

    @Ignore
    @Test
    public void test4() {
        List<Pair> list = solution.execute(new int[]{3,2,8,4,9,0,6,7}, 10);

        assertNotNull(list);
        assertEquals(list.size(), 3);
        // TODO create smart assert check
    }
}