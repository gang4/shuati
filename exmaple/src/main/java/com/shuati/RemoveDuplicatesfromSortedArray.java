package com.shuati;

public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int orgLength = nums.length;
        int empty = - 200;
        int last = nums[0];
        for (int i = 1; i < nums.length; i ++) {
            if (last == nums[i]) {
                last = nums[i];
                nums[i] = empty;  
                orgLength --;  
            }
            else {
                last = nums[i];
            }
        } 
        for (int i = 1; i < orgLength; i ++) {
            if (nums[i] == empty) {
                for (int j = i; j < nums.length - 1; j ++) {
                    nums[j] = nums[j + 1];
                }
                i --;
            }
        }
        return orgLength;
    }
}
