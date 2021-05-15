package com.codingbat.shuricans.warmup1.backAround;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {

    private final Solution solution = new Solution();

    /*
    backAround("cat") → "tcatt"
    backAround("Hello") → "oHelloo"
    backAround("a") → "aaa"
     */
    @Test
    public void testBackAround() {
        assertEquals("tcatt", solution.backAround("cat"));
        assertEquals("oHelloo", solution.backAround("Hello"));
        assertEquals("aaa", solution.backAround("a"));
    }
}
