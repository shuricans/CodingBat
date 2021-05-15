package com.codingbat.shuricans.warmup1.stringE;

/**
 * Warmup-1 > stringE
 * https://codingbat.com/prob/p173784
 *
 * Return true if the given string contains between 1 and 3 'e' chars.
 */

public class Solution {

    public boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'e') {
                count++;
            }
        }
        return count >= 1 && count <=3;
    }
}
