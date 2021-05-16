package com.codingbat.shuricans.warmup2.altPairs;

/**
 * Warmup-2 > altPairs
 * https://codingbat.com/prob/p121596
 *
 * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
 *
 *
 * altPairs("kitten") → "kien"
 * altPairs("Chocolate") → "Chole"
 * altPairs("CodingHorror") → "Congrr"
 */
public class Solution {

    public String altPairs(String str) {
        if(str.isEmpty() || str.length() <= 2) {
            return str;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i+=4) {
            sb.append(str.charAt(i));
            if(i + 1 < str.length())
                sb.append(str.charAt(i + 1));
        }
        return sb.toString();
    }
}
