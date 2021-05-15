package com.codingbat.shuricans.warmup2.stringBits;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Warmup-2 > stringBits
 * https://codingbat.com/prob/p165666
 *
 * Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
 *
 *
 * stringBits("Hello") → "Hlo"
 * stringBits("Hi") → "H"
 * stringBits("Heeololeo") → "Hello"
 */

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testStringBits() {
        assertEquals("Hlo", solution.stringBits("Hello"));
        assertEquals("H", solution.stringBits("Hi"));
        assertEquals("Hello", solution.stringBits("Heeololeo"));
    }
}
