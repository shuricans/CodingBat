package com.codingbat.shuricans.everyNth;

/**
 * Warmup-1 > everyNth
 * https://codingbat.com/prob/p196441
 *
 * Given a non-empty string and an int N, return the string made starting with char 0,
 * and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
 *
 * everyNth("Miracle", 2) → "Mrce"
 * everyNth("abcdefg", 2) → "aceg"
 * everyNth("abcdefg", 3) → "adg"
 */
public class Solution {
    public String everyNth(String str, int n) {
        StringBuilder sb = new StringBuilder(Character.toString(str.charAt(0)));

        for (int i = n; i < str.length(); i+=n) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }
}
