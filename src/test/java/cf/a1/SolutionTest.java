package cf.a1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertEquals(solution.execute(6, 6, 4), 4);
    }

    @Test
    public void test2() {
        assertEquals(solution.execute(1000000000, 1000000000, 1), 1000000000000000000L);
    }
}