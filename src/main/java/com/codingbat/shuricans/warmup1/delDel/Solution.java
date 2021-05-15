package com.codingbat.shuricans.delDel;

/**
 * Warmup-1 > delDel
 * https://codingbat.com/prob/p100905
 *
 * Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted.
 * Otherwise, return the string unchanged.
 */
public class Solution {

    public String delDel(String str) {
        if(!str.contains("del")) {
            return str;
        } else if(str.matches("^.del.*$")) {
            return str.replaceFirst("del", "");
        } else return str;
    }
}