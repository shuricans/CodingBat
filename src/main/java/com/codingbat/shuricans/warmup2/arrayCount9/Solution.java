package com.codingbat.shuricans.warmup2.arrayCount9;

/**
 * Warmup-2 > arrayCount9
 * https://codingbat.com/prob/p184031
 *
 * Given an array of ints, return the number of 9's in the array.
 *
 *
 * arrayCount9([1, 2, 9]) → 1
 * arrayCount9([1, 9, 9]) → 2
 * arrayCount9([1, 9, 9, 3, 9]) → 3
 */
public class Solution {

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if(i == 9) count++;
        }
        return count;
    }
}
