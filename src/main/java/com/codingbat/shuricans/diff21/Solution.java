package com.codingbat.shuricans.diff21;

/**
 * Warmup-1 > diff21
 * hhttps://codingbat.com/prob/p116624
 *
 * Given an int n, return the absolute difference between n and 21,
 * except return double the absolute difference if n is over 21.
 */

public class Solution {

    public int diff21(int n) {
        int diff = Math.abs(n - 21);
        return n > 21 ? diff * 2 : diff;
    }
}
