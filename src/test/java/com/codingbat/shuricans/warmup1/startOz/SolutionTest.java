package com.codingbat.shuricans.startOz;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {
    Solution solution = new Solution();

    /*
    startOz("ozymandias") → "oz"
    startOz("bzoo") → "z"
    startOz("oxx") → "o"
     */
    @Test
    public void testStartOz() {
        assertEquals("oz", solution.startOz("ozymandias"));
        assertEquals("z", solution.startOz("bzoo"));
        assertEquals("o", solution.startOz("oxx"));
        assertEquals("", solution.startOz("abc"));
    }
}
