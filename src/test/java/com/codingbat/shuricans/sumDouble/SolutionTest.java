package com.codingbat.shuricans.sumDouble;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {

    /*
    sumDouble(1, 2) → 3
    sumDouble(3, 2) → 5
    sumDouble(2, 2) → 8
     */

    private final Solution solution = new Solution();

    @Test
    public void testSumDouble() {
        assertEquals(3, solution.sumDouble(1, 2));
        assertEquals(5, solution.sumDouble(3, 2));
        assertEquals(8, solution.sumDouble(2, 2));
    }
}
