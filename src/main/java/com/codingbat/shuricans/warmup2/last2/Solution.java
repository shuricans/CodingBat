package com.codingbat.shuricans.warmup2.last2;

/**
 * Warmup-2 > last2
 * https://codingbat.com/prob/p178318
 *
 * Given a string, return the count of the number of times that a substring length 2 appears in
 * the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
 *
 *
 * last2("hixxhi") → 1
 * last2("xaxxaxaxx") → 1
 * last2("axxxaaxx") → 2
 */
public class Solution {

    public int last2(String str) {
        if(str.isEmpty() || str.length() <= 3) {
            return 0;
        }
        int count = 0;
        String endSS = str.substring(str.length() - 2);
        String s;
        for (int i = 0; i < str.length() - 2; i++) {
            s = str.substring(i, i+2);
            if(s.equals(endSS)) {
                count++;
            }
        }
        return count;
    }
}
