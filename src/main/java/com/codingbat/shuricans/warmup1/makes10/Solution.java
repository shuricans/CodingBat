package com.codingbat.shuricans.warmup1.makes10;

/**
 * Warmup-1 > makes10
 * https://codingbat.com/prob/p182873
 *
 * Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
 */

public class Solution {
    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10) || (a + b == 10);
    }
}
