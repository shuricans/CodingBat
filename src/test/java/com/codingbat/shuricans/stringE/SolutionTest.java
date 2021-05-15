package com.codingbat.shuricans.stringE;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    /*
    stringE("Hello") → true
    stringE("Heelle") → true
    stringE("Heelele") → false
    stringE("Hll") → false
    stringE("e") → true
    stringE("") → false
     */
    @Test
    public void testStringE() {
        assertTrue(solution.stringE("Hello"));
        assertTrue(solution.stringE("Heelle"));
        assertFalse(solution.stringE("Heelele"));
        assertFalse(solution.stringE("Hll"));
        assertTrue(solution.stringE("e"));
        assertFalse(solution.stringE(""));
    }
}
