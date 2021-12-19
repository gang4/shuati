package com.shuati;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        return searchInsert(nums, 0, nums.length, target);
    }

    private int searchInsert(int[] nums, int low, int high, int target) {
        int middle = low + (high - low) / 2;
        if (middle - low == 0) {
            if (low == nums.length) {
                return low;
            }
            else if (nums[low] < target) {
                return low + 1;
            }
            else {
                return low;
            }
        }
        if (target <= nums[middle]) {
            return searchInsert(nums, low, middle, target);
        } 
        else {  
            return searchInsert(nums, middle + 1, high, target);
        } 
    }
}
