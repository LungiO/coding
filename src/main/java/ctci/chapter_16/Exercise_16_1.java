package ctci.chapter_16;

/**
 * 16.1 Number Swapper:
 * Write a function to swap a number in place (that is, without temporary variables).
 */

class Exercise_16_1 {
    void calcSolution(SwapNumberPair pair) {
        pair.num1 ^= pair.num2;
        pair.num2 ^= pair.num1;
        pair.num1 ^= pair.num2;
    }
}
