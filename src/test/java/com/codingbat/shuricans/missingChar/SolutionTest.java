package com.codingbat.shuricans.missingChar;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    /*
    missingChar("kitten", 1) → "ktten"
    missingChar("kitten", 0) → "itten"
    missingChar("kitten", 4) → "kittn"
    */

    @Test
    public void testMissingChar() {
        assertEquals("ktten", solution.missingChar("kitten", 1));
        assertEquals("itten", solution.missingChar("kitten", 0));
        assertEquals("kittn", solution.missingChar("kitten", 4));
        assertEquals("kitte", solution.missingChar("kitten", 5));
    }
}
