package com.shuati;

// https://leetcode.com/problems/palindrome-number/
public class PalindromeNumber {
    private int idx = 0;
    private int [] nums;
    public boolean isPalindrome(int x) {
        this.idx = 0;
        int [] nums = toIntArray(x);
        if (nums == null) {
            return false;
        }
        int len = idx / 2;
        for (int i = 0; i < len; i ++) {
            if (nums[i] == nums[idx - (i + 1)]) {
                continue;
            }
            return false;
        } 
        return true;
    }

    public int [] toIntArray(int x) {
        if (x < 0 || x > 0x7fffffff) {
            return null;
        }
        // 2,147,483,647 (2^31 − 1)
        this.nums = new int[10];
        while (x > 0) {
            this.nums[idx] = x % 10;
            x /= 10;
            this.idx ++;
        }
        return nums;
    }   
}
