package com.codingbat.shuricans.warmup1.parrotTrouble;

/**
 * Warmup-1 > parrotTrouble
 * https://codingbat.com/prob/p140449
 *
 * We have a loud talking parrot.
 * The "hour" parameter is the current hour time in the range 0..23.
 * We are in trouble if the parrot is talking and the hour is before 7 or after 20.
 * Return true if we are in trouble.
 */

public class Solution {

    public boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }
}
