package com.codingbat.shuricans.mixStart;

/**
 * Warmup-1 > mixStart
 * https://codingbat.com/prob/p151713
 *
 * Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count
 */

public class Solution {

    public boolean mixStart(String str) {
        return str.matches("^.ix.*$");
    }
}
