package com.codingbat.shuricans.everyNth;

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {
    private final Solution solution = new Solution();

    /*
    everyNth("Miracle", 2) → "Mrce"
    everyNth("abcdefg", 2) → "aceg"
    everyNth("abcdefg", 3) → "adg"
     */
    @Test
    public void testEveryNth() {
        assertEquals("Mrce", solution.everyNth("Miracle", 2));
        assertEquals("aceg", solution.everyNth("abcdefg", 2));
        assertEquals("adg", solution.everyNth("abcdefg", 3));
    }
}
