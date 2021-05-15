package com.codingbat.shuricans.warmup2.countXX;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Warmup-2 > countXX
 * https://codingbat.com/prob/p194667
 *
 * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
 *
 *
 * countXX("abcxx") → 1
 * countXX("xxx") → 2
 * countXX("xxxx") → 3
 * countXX("xxxxx") → 4
 * countXX("xxxxxx") → 5
 */

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testCountXX() {
        assertEquals(1, solution.countXX("abcxx"));
        assertEquals(2, solution.countXX("xxx"));
        assertEquals(3, solution.countXX("xxxx"));
        assertEquals(4, solution.countXX("xxxxx"));
        assertEquals(5, solution.countXX("xxxxxx"));
        assertEquals(1, solution.countXX("abx1_sdfxx_43324x"));
        assertEquals(0, solution.countXX("x x"));
        assertEquals(0, solution.countXX("x"));
        assertEquals(4, solution.countXX("xx xx xxxXx"));
    }
}
