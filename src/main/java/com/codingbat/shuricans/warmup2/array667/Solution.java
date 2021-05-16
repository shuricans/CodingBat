package com.codingbat.shuricans.warmup2.array667;

/**
 * Warmup-2 > array667
 * https://codingbat.com/prob/p110019
 *
 * Given an array of ints, return the number of times that two 6's are next to each other in the array.
 * Also count instances where the second "6" is actually a 7.
 *
 *
 * array667([6, 6, 2]) → 1
 * array667([6, 6, 2, 6]) → 1
 * array667([6, 7, 2, 6]) → 1
 */
public class Solution {

    public int array667(int[] nums) {
        int count = 0;
        final int length = nums.length;
        for (int i = 0; i < length; i++) {
            if(nums[i] == 6 && i + 1 < length) {
                if(nums[i + 1] == 6 || nums[i + 1] == 7) {
                    count++;
                }
            }
        }

        return  count;
    }
}
