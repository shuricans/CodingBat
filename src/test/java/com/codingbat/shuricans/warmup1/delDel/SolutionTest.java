package com.codingbat.shuricans.delDel;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {

    private final Solution solution = new Solution();

    /*
    delDel("adelbc") → "abc"
    delDel("adelHello") → "aHello"
    delDel("adedbc") → "adedbc"
     */
    @Test
    public void testDelDel() {
        assertEquals("abc", solution.delDel("adelbc"));
        assertEquals("aHello", solution.delDel("adelHello"));
        assertEquals("adedbc", solution.delDel("adedbc"));
    }
}
