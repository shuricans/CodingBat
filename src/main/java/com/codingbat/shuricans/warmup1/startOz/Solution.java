package com.codingbat.shuricans.warmup1.startOz;

/**
 * Warmup-1 > startOz
 * https://codingbat.com/prob/p199720
 *
 * Given a string, return a string made of the first 2 chars (if present),
 * however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
 *
 * startOz("ozymandias") → "oz"
 * startOz("bzoo") → "z"
 * startOz("oxx") → "o"
 */

public class Solution {

    public String startOz(String str) {
        if(str.isEmpty()) {
            return str;
        } else if(str.startsWith("oz")) {
            return "oz";
        } else if (str.matches("^.z.*$")) {
            return "z";
        } else if (str.matches("^o.*$")) {
            return "o";
        }
        return "";
    }
}