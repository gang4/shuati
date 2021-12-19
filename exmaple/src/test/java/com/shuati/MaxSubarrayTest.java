package com.shuati;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;    
    
public class MaxSubarrayTest {

    @Before
    public void setup(){

    }
        
    @Test
    public void test() {
        MaxSubarray m = new MaxSubarray();
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int rt = m.maxDP(nums);
        assertTrue(rt == 6);
        int [] nums1 = {5,4,-1,7,8};
        rt = m.maxDP(nums1);
        assertTrue(rt == 23);
        int [] nums2 = {1, 1, 1, -5, -5 -5};
        rt = m.maxDP(nums2);
        assertTrue(rt == 3);
    }
}
    