package com.codingbat.shuricans.warmup1.diff21;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    /*
    diff21(19) → 2
    diff21(10) → 11
    diff21(21) → 0
     */

    @Test
    public void testDiff21() {
        assertEquals(2, solution.diff21(19));
        assertEquals(11, solution.diff21(10));
        assertEquals(0, solution.diff21(21));
    }
}
