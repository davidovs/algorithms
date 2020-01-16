package hw.task6;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertTrue(solution.execute(null, null));
    }

    @Test
    public void test2() {
        List<Integer> list = Arrays.asList(1, 2, 3);
        assertTrue(solution.execute(list, list));
    }

    @Test
    public void test3() {
        assertFalse(solution.execute(null, Arrays.asList(1, 2, 3)));
    }

    @Test
    public void test4() {
        assertFalse(solution.execute(Arrays.asList(1, 2, 3), null));
    }

    @Test
    public void test5() {
        assertTrue(solution.execute(Arrays.asList(1, 2, 3), Arrays.asList(3, 2, 1)));
    }

    @Test
    public void test6() {
        assertFalse(solution.execute(Arrays.asList(1, 2, 3), Arrays.asList(3, 2, 1, 1)));
    }

    @Test
    public void test7() {
        assertTrue(solution.execute(Arrays.asList(1, 2, 1, 3), Arrays.asList(3, 2, 1, 1)));
    }

    @Test
    public void test8() {
        assertTrue(solution.execute(Arrays.asList(1, 2, 1, 3, 0), Arrays.asList(3, 2, 0, 1, 1)));
    }

    @Test
    public void test9() {
        assertTrue(solution.execute(Arrays.asList(1, 2, 1, -1, 3, 0, -1), Arrays.asList(-1, 3, 2, -1, 0, 1, 1)));
    }
}
