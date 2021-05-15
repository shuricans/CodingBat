package com.codingbat.shuricans.warmup1.monkeyTrouble;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {

    private final Solution solution = new Solution();

    /*
    monkeyTrouble(true, true) → true
    monkeyTrouble(false, false) → true
    monkeyTrouble(true, false) → false
     */

    @Test
    public void testMonkeyTrouble() {
        assertTrue(solution.monkeyTrouble(true, true));
        assertTrue(solution.monkeyTrouble(false, false));
        assertFalse(solution.monkeyTrouble(true, false));
        assertFalse(solution.monkeyTrouble(false, true));
    }
}
