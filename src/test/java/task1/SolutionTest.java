package task1;

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
    }
}