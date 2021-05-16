package com.codingbat.shuricans.warmup2.array123;

import java.util.Arrays;

/**
 * Warmup-2 > array123
 * https://codingbat.com/prob/p136041
 *
 * Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
 *
 *
 * array123([1, 1, 2, 3, 1]) → true
 * array123([1, 1, 2, 4, 1]) → false
 * array123([1, 1, 2, 1, 2, 3]) → true
 */
public class Solution {

    public boolean array123(int[] nums) {
        return Arrays.toString(nums).matches(".*1, 2, 3.*");
    }
}
