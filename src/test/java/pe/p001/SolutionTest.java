package pe.p001;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertEquals(solution.execute(3, 5, 10), 23);
    }

    @Test
    public void test2() {
        assertEquals(solution.execute(3, 5, 1000), 233168);
    }
}