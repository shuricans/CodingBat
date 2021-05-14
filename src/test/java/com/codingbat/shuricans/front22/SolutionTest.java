package com.codingbat.shuricans.front22;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    /*
    front22("kitten") → "kikittenki"
    front22("Ha") → "HaHaHa"
    front22("abc") → "ababcab"
     */

    @Test
    public void testFront22() {
        assertEquals("kikittenki", solution.front22("kitten"));
        assertEquals("HaHaHa", solution.front22("Ha"));
        assertEquals("ababcab", solution.front22("abc"));
        assertEquals("aaa", solution.front22("a"));
    }
}
