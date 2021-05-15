package com.codingbat.shuricans.close10;

/**
 * Warmup-1 > close10
 * https://codingbat.com/prob/p172021
 *
 *
 * Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
 * Note that Math.abs(n) returns the absolute value of a number.
 */

public class Solution {

    public int close10(int a, int b) {
        int diffA = Math.abs(a - 10);
        int diffB = Math.abs(b - 10);

        if(diffA == diffB) {
            return 0;
        }
        return diffA < diffB ? a : b;
    }
}
