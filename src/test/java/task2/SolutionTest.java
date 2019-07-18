package task2;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void test1() {
        Assert.assertEquals(solution.execute(new int[]{5, -3, 2, 7, -4, 0, 1}), 3);
    }
}