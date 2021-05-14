package com.codingbat.shuricans.monkeyTrouble;
/**
 * Warmup-1 > monkeyTrouble
 * https://codingbat.com/prob/p181646
 *
 * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
 * We are in trouble if they are both smiling or if neither of them is smiling.
 * Return true if we are in trouble.
 */
public class Solution {

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }
}
