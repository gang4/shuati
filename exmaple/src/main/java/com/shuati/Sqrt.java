package com.shuati;

public class Sqrt {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        if (x < 3) {
            return 1;
        }
        long y = x;
        long rt = y / 2;
        long last = rt;
        while (true) {
            long tmp = rt * rt;
            if (tmp > y) {
                last = rt;
                rt /= 2;
                continue;
            }
            else if (tmp == y) {
                return (int)rt;
            }
            break;
        }
        // Now result should be with in rt and last.
        long low = rt;
        long high = last;
        rt += (high - low) / 2;
        while ((high - low) / 2 > 0) {
            long tmp = rt * rt;
            if (tmp > y) {
                high = rt;
                rt = low + (high - low) / 2;
            }
            else if (tmp == y) {
                return (int)rt;
            }
            else {
                low = rt;
                rt += (high - low) / 2;
            }
        }
        return (int)rt;
    }
}
