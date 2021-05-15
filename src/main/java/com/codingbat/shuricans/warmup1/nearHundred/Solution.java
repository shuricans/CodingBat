package com.codingbat.shuricans.nearHundred;

/**
 * Warmup-1 > nearHundred
 * https://codingbat.com/prob/p184004
 *
 *
 * Given an int n, return true if it is within 10 of 100 or 200.
 * Note: Math.abs(num) computes the absolute value of a number.
 */

public class Solution {

    public boolean nearHundred(int n) {
        return Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10;
    }
}
