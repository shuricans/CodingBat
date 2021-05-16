package com.codingbat.shuricans.warmup2.stringMatch;

/**
 * Warmup-2 > stringMatch
 * https://codingbat.com/prob/p198640
 * <p>
 * Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
 * So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
 *
 *
 * stringMatch("xxcaazz", "xxbaaz") → 3
 * stringMatch("abc", "abc") → 2
 * stringMatch("abc", "axc") → 0
 */
public class Solution {

    public int stringMatch(String a, String b) {
        if (a.isEmpty() || b.isEmpty() || a.length() < 2 || b.length() < 2) {
            return 0;
        }
        int count = 0;
        String sa, sb;
        for (int i = 0; i < a.length() - 1; i++) {
            sa = a.substring(i, i + 2);
            if(i < b.length() - 1) {
                sb = b.substring(i, i + 2);
                if (sa.equals(sb)) {
                    count++;
                }
            }
        }
        return count;
    }
}
