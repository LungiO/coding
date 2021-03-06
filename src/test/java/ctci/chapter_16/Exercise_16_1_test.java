package ctci.chapter_16;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class Exercise_16_1_test {
    private Random rnd = new Random();

    @Test
    public void test() {
        for (int i = 0; i < 100; i++) {
            testRandomNumberSwap();
        }
    }

    private void testRandomNumberSwap() {
        int num1 = rnd.nextInt();
        int num2 = rnd.nextInt();
        SwapNumberPair pair = new SwapNumberPair();
        pair.num1 = num1;
        pair.num2 = num2;

        new Exercise_16_1().calcSolution(pair);

        Assert.assertEquals(num1, pair.num2);
        Assert.assertEquals(num2, pair.num1);
    }
}
