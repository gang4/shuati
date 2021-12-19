package com.shuati;

public class ClimbingStairs {
    public int climbStairs(int n) {
        // https://leetcode.com/problems/climbing-stairs/submissions/
        // This is a DP problem.
        // s[n + 1]  = s[n] + s[n-1], the last is 1 step + the last is 2 steps. 
        // s[1] = 1; s[0] = 1;
        // s[2] = s[1] + s[0] = 2
        // s[3] = s[2] + s[1] = 3
        // s[4] = s[3] + s[2] = 5
        if (n == 1) {
            return 1;
        }
        int s0 = 1;
        int s1 = 1;
        int ac = 1;
        for (int i = 1; i < n; i ++) {
            ac = s1 + s0;
            s0 = s1;
            s1 = ac;
        }
        return ac;
    }
}
