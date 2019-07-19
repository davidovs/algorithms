package cf.a1055;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void test1() {
        String line1 = "5 3";
        String line2 = "1 1 1 1 1";
        String line3 = "1 1 1 1 1";

        assertEquals(solution.execute(line1, line2, line3), "YES");
    }

    @Test
    public void test2() {
        String line1 = "5 4";
        String line2 = "1 0 0 0 1";
        String line3 = "0 1 1 1 1";

        assertEquals(solution.execute(line1, line2, line3), "YES");
    }

    @Test
    public void test3() {
        String line1 = "5 2";
        String line2 = "0 1 1 1 1";
        String line3 = "1 1 1 1 1";

        assertEquals(solution.execute(line1, line2, line3), "NO");
    }
}