package com.codingbat.shuricans.warmup1.icyHot;

/**
 * Warmup-1 > icyHot
 * https://codingbat.com/prob/p192082
 *
 * Given two temperatures, return true if one is less than 0 and the other is greater than 100.
 */
public class Solution {

    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100);
    }
}
