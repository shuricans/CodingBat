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
    public static void main(String[] args) {
        String s = "code";
        System.out.println(new Solution().stringSplosion("Code"));
        System.out.println(new Solution().stringSplosion("abc"));
        System.out.println(new Solution().stringSplosion("ab"));
    }

    public String stringSplosion(String str) {
        if(str.isEmpty()) {
            return str;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= str.length(); i++) {
            sb.append(str, 0, i);
        }

        return sb.toString();
    }
}
