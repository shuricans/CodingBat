package com.codingbat.shuricans.warmup2.stringTimes;

/**
 * Warmup-2 > stringTimes
 * https://codingbat.com/prob/p142270
 *
 * Given a string and a non-negative int n, return a larger string that is n copies of the original string.
 *
 * stringTimes("Hi", 2) → "HiHi"
 * stringTimes("Hi", 3) → "HiHiHi"
 * stringTimes("Hi", 1) → "Hi"
 */
public class Solution {

    public String stringTimes(String str, int n) {
        switch (n) {
            case 0:
                return "";
            case 1:
                return str;
            default:
                StringBuilder stringBuilder = new StringBuilder(str);
                for (int i = 0; i < n - 1; i++) {
                    stringBuilder.append(str);
                }
                return stringBuilder.toString();
        }
    }
}
