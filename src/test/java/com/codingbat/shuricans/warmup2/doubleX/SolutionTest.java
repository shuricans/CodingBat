package com.codingbat.shuricans.warmup2.doubleX;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Warmup-2 > doubleX
 * https://codingbat.com/prob/p186759
 *
 * Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
 *
 *
 * doubleX("axxbb") → true
 * doubleX("axaxax") → false
 * doubleX("xxxxx") → true
 */
public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testDoubleX() {
        assertTrue(solution.doubleX("axxbb"));
        assertFalse(solution.doubleX("axaxax"));
        assertTrue(solution.doubleX("xxxxx"));
        assertFalse(solution.doubleX("2xasxxx"));
    }
}
