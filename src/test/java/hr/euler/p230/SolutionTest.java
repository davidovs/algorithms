package hr.euler.p230;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void test1() {
        String[][] array = {{"1415926535", "8979323846", "35"}};
        assertEquals(solution.execute(1, array), '9');
    }

    // TODO write test2 with huge position
}