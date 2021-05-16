package com.codingbat.shuricans.warmup2.has271;

/**
 * Warmup-2 > has271
 * https://codingbat.com/prob/p167430
 *
 * Given an array of ints, return true if it contains a 2, 7, 1 pattern:
 * a value, followed by the value plus 5, followed by the value minus 1.
 * Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
 *
 *
 * has271([1, 2, 7, 1]) → true
 * has271([1, 2, 8, 1]) → false
 * has271([2, 7, 1]) → true
 */
public class Solution {

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 1};
        System.out.println(new Solution().has271(arr));
    }

    public boolean has271(int[] nums) {
        if(nums.length < 3) {
            return false;
        }
        int prev = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == prev + 5) {
                if(i + 1 < nums.length) {
                    if(Math.abs(prev - 1 - nums[i + 1]) <= 2) {
                        return true;
                    }
                }
            }
            prev = nums[i];
        }
        return false;
    }
}
