package task2;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void test1() {
        Assert.assertEquals(solution.execute(new int[]{1, 2, 0}), 3);
    }

    @Test
    public void test2() {
        Assert.assertEquals(solution.execute(new int[]{3, 4, -1, 1}), 2);
    }

    @Test
    public void test3() {
        Assert.assertEquals(solution.execute(new int[]{7, 8, 9, 11, 12}), 1);
    }

    @Test
    public void test4() {
        Assert.assertEquals(solution.execute(new int[]{5, -3, 2, 7, -4, 0, 1}), 3);
    }
}