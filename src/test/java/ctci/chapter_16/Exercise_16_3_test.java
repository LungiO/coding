package ctci.chapter_16;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class Exercise_16_3_test {
    private static final double DELTA = 0.0001;
    private Random rnd = new Random();

    @Test
    public void test() {

        for (int i = 0; i < 100; i++) {
            testRandomIntersections();
        }
    }

    private void testRandomIntersections() {
        GraphPoint line1start = randomPoint();
        GraphPoint line1end = randomPointDifferentFrom(line1start);
        GraphPoint line2start = randomPoint();
        GraphPoint line2end = randomPointDifferentFrom(line2start);

        Exercise_16_3 solution = new Exercise_16_3();
        GraphPoint intersection = solution.calcSolution(line1start, line1end, line2start, line2end);

        Assert.assertEquals(intersection.y, solution.line1.getYAtX(intersection.x), DELTA);
        Assert.assertEquals(intersection.y, solution.line2.getYAtX(intersection.x), DELTA);
    }

    private GraphPoint randomPoint() {
        int x = rnd.nextInt(200) - 100;
        int y = rnd.nextInt(200) - 100;
        return new GraphPoint(x, y);
    }

    private GraphPoint randomPointDifferentFrom(GraphPoint point) {
        GraphPoint differentPoint = randomPoint();
        while (differentPoint.x == point.x || differentPoint.y == point.y) {
            differentPoint = randomPoint();
        }
        return differentPoint;
    }
}
