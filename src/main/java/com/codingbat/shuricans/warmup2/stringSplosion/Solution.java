package com.codingbat.shuricans.warmup2.stringSplosion;

/**
 * Warmup-2 > stringSplosion
 * https://codingbat.com/prob/p117334
 *
 * Given a non-empty string like "Code" return a string like "CCoCodCode".
 *
 *
 * stringSplosion("Code") → "CCoCodCode"
 * stringSplosion("abc") → "aababc"
 * stringSplosion("ab") → "aab"
 */
public class Solution {

    public String stringSplosion(String str) {
        if(str.isEmpty()) {
            return str;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= str.length(); i++) {
            sb.append(str.substring(0, i));
        }

        return sb.toString();
    }
}
