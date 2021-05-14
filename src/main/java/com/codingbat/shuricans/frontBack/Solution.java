package com.codingbat.shuricans.frontBack;

/**
 * Warmup-1 > frontBack
 * https://codingbat.com/prob/p123384
 *
 *
 * Given a string, return a new string where the first and last chars have been exchanged.
 */

public class Solution {

    public static void main(String[] args) {
        String s = "code";
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(s.length()-1));
        System.out.println(s.substring(1, s.length() - 1));
    }

    public String frontBack(String str) {
        if (str.length() == 1 || str.isEmpty()) {
            return str;
        } else {
            return str.charAt(str.length()-1) + str.substring(1, str.length() - 1) + str.charAt(0);
        }
    }
}
