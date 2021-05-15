package com.codingbat.shuricans.warmup2.doubleX;

/**
 * Warmup-2 > doubleX
 * https://codingbat.com/prob/p186759
 *
 * Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
 *
 *
 * doubleX("axxbb") → true
 * doubleX("axaxax") → false
 * doubleX("xxxxx") → true
 */
public class Solution {

    boolean doubleX(String str) {
        boolean isX = false;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'x') {
                if(isX) {
                    return true;
                }
                isX = true;
            } else if (isX) {
                return false;
            }
        }
        return false;
    }
}
