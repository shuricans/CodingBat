package com.codingbat.shuricans.max1020;

/**
 * Warmup-1 > max1020
 * https://codingbat.com/prob/p177372
 *
 * Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
 * or return 0 if neither is in that range.
 */

public class Solution {

    public int max1020(int a, int b) {
        boolean A = false, B = false;
        if (a >= 10 && a <= 20) {
            A = true;
        }
        if (b >= 10 && b <=20) {
            B = true;
        }
        if(A && B) {
            return Math.max(a, b);
        } else if (!A && !B) {
            return 0;
        } else if(A) {
            return a;
        } else
            return b;
    }
}
