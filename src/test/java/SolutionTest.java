import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void paintWallsTest1(){
        int[] cost = {1,2,3,2};
        int[] time = {1,2,3,2};
        int expected = 3;
        int actual = new Solution().paintWalls(cost, time);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void paintWallsTest2(){
        int[] cost = {2,3,4,2};
        int[] time = {1,1,1,1};
        int expected = 4;
        int actual = new Solution().paintWalls(cost, time);

        Assert.assertEquals(expected, actual);
    }
}
