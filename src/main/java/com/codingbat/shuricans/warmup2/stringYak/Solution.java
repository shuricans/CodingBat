package com.codingbat.shuricans.warmup2.stringYak;

/**
 * Warmup-2 > stringYak
 * https://codingbat.com/prob/p126212
 *
 * Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed,
 * but the "a" can be any char. The "yak" strings will not overlap.
 *
 *
 * stringYak("yakpak") → "pak"
 * stringYak("pakyak") → "pak"
 * stringYak("yak123ya") → "123ya"
 */
public class Solution {

    public String stringYak(String str) {
        return str.replaceAll("y.k","");
    }
}
