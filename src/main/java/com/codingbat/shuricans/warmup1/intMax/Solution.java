package com.codingbat.shuricans.intMax;

/**
 * Warmup-1 > intMax
 * https://codingbat.com/prob/p101887
 *
 * Given three int values, a b c, return the largest.
 */

public class Solution {

    public int intMax(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}
