package task5;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertTrue(solution.execute(12321));
    }

    @Test
    public void test2() {
        assertTrue(solution.execute(123321));
    }

    @Test
    public void test3() {
        assertFalse(solution.execute(12345));
    }

    @Test
    public void test4() {
        assertTrue(solution.execute(1));
    }

    @Test
    public void test5() {
        assertTrue(solution.execute(0));
    }

    @Test
    public void test6() {
        assertTrue(solution.execute(11));
    }

    @Test
    public void test7() {
        assertFalse(solution.execute(12));
    }
}
