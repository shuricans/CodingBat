package com.codingbat.shuricans.warmup2.stringX;

/**
 * Warmup-2 > stringX
 * https://codingbat.com/prob/p171260
 *
 * Given a string, return a version where all the "x" have been removed.
 * Except an "x" at the very start or end should not be removed.
 *
 *
 * stringX("xxHxix") → "xHix"
 * stringX("abxxxcd") → "abcd"
 * stringX("xabxxxcdx") → "xabcdx"
 */
public class Solution {

    public String stringX(String str) {
        boolean startX = str.startsWith("x");
        boolean endX = str.endsWith("x") && str.length() > 1;
        str = str.replaceAll("x", "");
        if(startX) {
            str = "x" + str;
        }
        if(endX) {
            str = str + "x";
        }
        return str;
    }
}
