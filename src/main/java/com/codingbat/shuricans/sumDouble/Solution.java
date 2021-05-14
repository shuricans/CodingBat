package com.codingbat.shuricans.sumDouble;

/**
 * Warmup-1 > sumDouble
 * https://codingbat.com/prob/p154485
 *
 * Given two int values, return their sum.
 * Unless the two values are the same, then return double their sum.
 */

public class Solution {

    public int sumDouble(int a, int b) {
        int sum = a + b;
        return a != b ? sum : sum * 2;
    }
}
