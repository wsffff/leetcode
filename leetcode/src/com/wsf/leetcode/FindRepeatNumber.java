package com.wsf.leetcode;

import java.util.HashSet;

/**
 * 剑指 Offer 03. 数组中重复的数字
 * <p>
 *     找出数组中重复的数字。
 *     在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 *     数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
 *     请找出数组中任意一个重复的数字。
 * </p>
 *
 * @author weisifan
 */
public class FindRepeatNumber {

    /**
     * Set
     *
     * @param nums
     */
    public static int findRepeatNumber1(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            } else {
                set.add(num);
            }
        }
        return -1;
    }

    /**
     * 原地置换
     *
     * @param nums
     * @return
     */
    public static int findRepeatNumber2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == i) {
                continue;
            }
            if (nums[i] == nums[nums[i]]) {
                return nums[i];
            } else {
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] ints = {3, 4, 0, 1, 3};
        findRepeatNumber2(ints);
    }
}
