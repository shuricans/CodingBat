package com.codingbat.shuricans.warmup1.lastDigit;

/**
 * Warmup-1 > lastDigit
 * https://codingbat.com/prob/p125339
 *
 * Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
 * Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
 */
public class Solution {

    public boolean lastDigit(int a, int b) {
        return a % 10 == b % 10;
    }
}
