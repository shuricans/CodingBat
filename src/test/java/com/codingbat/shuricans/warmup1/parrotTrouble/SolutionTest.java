package com.codingbat.shuricans.warmup1.parrotTrouble;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    /*
    parrotTrouble(true, 6) → true
    parrotTrouble(true, 7) → false
    parrotTrouble(false, 6) → false
     */

    @Test
    public void testParrotTrouble() {
        assertTrue(solution.parrotTrouble(true, 6));
        assertFalse(solution.parrotTrouble(true, 7));
        assertFalse(solution.parrotTrouble(false, 6));
    }
}
