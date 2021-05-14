package com.codingbat.shuricans.or35;

/**
 * Warmup-1 > or35
 * https://codingbat.com/prob/p112564
 *
 * Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
 * Use the % "mod" operator
 */
public class Solution {

    public boolean or35(int n) {
        return n > 0 && (n % 3 == 0 || n % 5 == 0);
    }
}
