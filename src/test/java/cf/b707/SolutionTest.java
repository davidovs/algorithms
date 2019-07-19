package cf.b707;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private Solution solution = new Solution();

    @Ignore
    @Test
    public void test1() {
        int[] array1 = {5, 4, 2};

        int[][] array2 = new int[][]{{1, 2, 5}, {1, 2, 3}, {2, 3, 4}, {1, 4, 10}, {1, 5}};

        assertEquals(solution.execute(array1, array2), 3);
    }

    @Ignore
    @Test
    public void test2() {
        int[] array1 = {3, 1, 1};

        int[][] array2 = new int[][]{{1, 2, 3}, {3}};

        assertEquals(solution.execute(array1, array2), -1);
    }
}