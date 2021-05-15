package com.codingbat.shuricans.warmup2.stringBits;

/**
 * Warmup-2 > stringBits
 * https://codingbat.com/prob/p165666
 *
 * Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
 *
 *
 * stringBits("Hello") → "Hlo"
 * stringBits("Hi") → "H"
 * stringBits("Heeololeo") → "Hello"
 */

public class Solution {

    public String stringBits(String str) {

        if(str.isEmpty() || str.length() == 1) {
            return str;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i+=2) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }
}
