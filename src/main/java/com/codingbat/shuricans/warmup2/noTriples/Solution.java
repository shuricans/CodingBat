package com.codingbat.shuricans.warmup2.noTriples;

/**
 * Warmup-2 > noTriples
 * https://codingbat.com/prob/p170221
 *
 * Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
 * Return true if the array does not contain any triples.
 *
 *
 * noTriples([1, 1, 2, 2, 1]) → true
 * noTriples([1, 1, 2, 2, 2, 1]) → false
 * noTriples([1, 1, 1, 2, 2, 2, 1]) → false
 */
public class Solution {

    public boolean noTriples(int[] nums) {
        if(nums.length < 3) {
            return true;
        }
        int count = 1;
        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(prev == nums[i]) {
                ++count;
                if(count == 3) {
                    return false;
                }
            } else {
                count = 1;
            }
            prev = nums[i];
        }
        return true;
    }
}
