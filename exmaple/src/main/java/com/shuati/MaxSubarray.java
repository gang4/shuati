package com.shuati;

public class MaxSubarray {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i ++) {
            int rt = max(nums, i + 1);
            if (max < rt) {
                max = rt;
            } 
        }
        return max;
    }

    int max(int [] nums, int len) {
        int max = Integer.MIN_VALUE;
        // First len
        int ac = 0;
        for (int i = 0; i < len; i ++) {
            ac += nums[i];
        }

        if (max < ac) {
            max = ac;
        }

        for (int i = 1; i < nums.length; i ++) {
            if (i + len - 1 == nums.length) {
                break;
            }
            ac = ac - nums[i - 1];
            ac += nums[i + len - 1]; 
            if (max < ac) {
                max = ac;
            }
        }
        return max;
    }

    public int maxDP(int [] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];
        // {1, 1, 1, -5, -5 -5}
        for (int i = 1; i < nums.length; i ++) {
            // For each step, assume we know the current max, then only thing
            // we need to know next is which one is bigger, next or next + current max  
            if (nums[i] > maxEndingHere + nums[i]) {
                maxEndingHere = nums[i];
            } else {
                maxEndingHere = maxEndingHere + nums[i];
            }
     
            // see above result is bigger than last max
            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
            }  
        }

        return maxSoFar;
    }
}
