package com.shuati;

public class StrStr {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }      
        if (haystack.length() < needle.length()) {
            return -1;
        }

        int i = 0;
        int j = 0;
        int idx = -1;
        for (; i < haystack.length() && j < needle.length(); i ++, j ++) {
            if (needle.charAt(j) == haystack.charAt(i)) {
                if (idx < 0) {
                    idx = i;
                }
                continue;
            }
            else {
                if (idx >= 0) {
                    i = idx;
                    idx = -1;
                }
                j = -1;
            }
        }
        if (j != needle.length()) {
            return -1;
        }
        return idx;
    }
}
