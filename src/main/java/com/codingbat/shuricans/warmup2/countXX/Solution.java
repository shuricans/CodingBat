package com.codingbat.shuricans.warmup2.countXX;

/**
 * Warmup-2 > countXX
 * https://codingbat.com/prob/p194667
 *
 * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
 *
 *
 * countXX("abcxx") → 1
 * countXX("xxx") → 2
 * countXX("xxxx") → 3
 * countXX("xxxxx") → 4
 * countXX("xxxxxx") → 5
 */
public class Solution {

    int countXX(String str) {
        int count = 0;
        boolean isX = false;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'x') {
                if(isX) {
                    count++;
                } else {
                    isX = true;
                }
            } else if(isX) {
                isX = false;
            }
        }
        return count;
    }
}
