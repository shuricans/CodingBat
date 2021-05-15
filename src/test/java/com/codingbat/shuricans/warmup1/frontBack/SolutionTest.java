package com.codingbat.shuricans.frontBack;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    /*
    frontBack("code") → "eodc"
    frontBack("a") → "a"
    frontBack("ab") → "ba"
     */

    @Test
    public void testFrontBack() {
        assertEquals("eodc", solution.frontBack("code"));
        assertEquals("a", solution.frontBack("a"));
        assertEquals("ba", solution.frontBack("ab"));
    }
}
