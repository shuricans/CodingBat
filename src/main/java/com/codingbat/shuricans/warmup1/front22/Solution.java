package com.codingbat.shuricans.warmup1.front22;

/**
 * Warmup-1 > front22
 * https://codingbat.com/prob/p183592
 *
 *
 * Given a string, take the first 2 chars and return the string with the 2 chars
 * added at both the front and back, so "kitten" yields"kikittenki".
 * If the string length is less than 2, use whatever chars are there.
 */

public class Solution {

    public String front22(String str) {
        if(str.isEmpty()) {
            return str;
        }else if(str.length() < 2) {
            return str + str + str;
        } else {
            String ss = str.substring(0, 2);
            return ss + str + ss;
        }
    }
}
