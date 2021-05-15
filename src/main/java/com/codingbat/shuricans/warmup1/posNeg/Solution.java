package com.codingbat.shuricans.warmup1.posNeg;


/**
 * Warmup-1 > posNeg
 * https://codingbat.com/prob/p159227
 *
 *
 * Given 2 int values, return true if one is negative and one is positive.
 * Except if the parameter "negative" is true, then return true only if both are negative.
 */

public class Solution {
    public boolean posNeg(int a, int b, boolean negative) {
        return (negative && a < 0 && b < 0) || !negative && ((a < 0 && b > 0) || (a > 0 && b < 0));
    }
}
