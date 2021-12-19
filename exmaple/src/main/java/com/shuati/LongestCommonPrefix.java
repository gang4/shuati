package com.shuati;

// https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 2 ) {
            if (strs.length == 1) {
                return strs[0];
            }
            return new String();
        }
        
        String rt = new String();
        for (int j = 0; j < 200; j ++) {
            if (strs[0].length() <= j) {
                break;
            }
            char c = strs[0].charAt(j);
            for (int i = 1; i < strs.length; i ++) {
                if (j < strs[i].length()) {
                    if (strs[i].charAt(j) == c) {
                        continue;
                    }
                    else {
                        return rt;
                    }
                }
                else {
                    return rt;
                }
            }
            rt += c;
        }
        return rt;
    }
}
