package com.codingbat.shuricans.sleepIn;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {

    private final Solution solution = new Solution();

    /*
    sleepIn(false, false) → true
    sleepIn(true, false) → false
    sleepIn(false, true) → true
    sleepIn(true, true) → true
    */

    @Test
    public void testSleepIn() {
        assertTrue(solution.sleepIn(false, false));
        assertFalse(solution.sleepIn(true, false));
        assertTrue(solution.sleepIn(false, true));
        assertTrue(solution.sleepIn(true,true));
    }
}
