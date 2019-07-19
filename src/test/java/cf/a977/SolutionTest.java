package cf.a977;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertEquals(solution.execute(512, 4), 50);
    }

    @Test
    public void test2() {
        assertEquals(solution.execute(1000000000, 9), 1);
    }
}