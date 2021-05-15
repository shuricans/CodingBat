package com.codingbat.shuricans.warmup1.notString;

/**
 * Warmup-1 > notString
 * https://codingbat.com/prob/p191914
 *
 *
 * Given a string, return a new string where "not " has been added to the front.
 * However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
 */

public class Solution {
    public String notString(String str) {
        return str.startsWith("not") ? str : "not " + str;
    }

}
