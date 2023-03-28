package org.example;

import java.util.Arrays;
public class SplitArray {
    public  boolean splitArraySameAverage(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int n = nums.length;
        Arrays.sort(nums);
        for (int len = 1; len <= n / 2; len++) {
            if (sum * len % n != 0) continue;
            int target = sum * len / n;
            if (canSplitMethod(nums, target, len, 0)) {
                return true;
            }
        }
        return false;
    }


    public boolean canSplitMethod(int[] nums, int target, int len, int start) {
        if (len == 0) {
            return target == 0;
        }
        if (target < 0) {
            return false;
        }
        for (int i = start; i <= nums.length - len; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;
            if (canSplitMethod(nums, target - nums[i], len - 1, i + 1)) {
                return true;
            }
        }
        return false;
    }
}
