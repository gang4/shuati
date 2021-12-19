package com.shuati;
import org.junit.Test;
import org.junit.Before;    
    
public class RemoveDuplicatesfromSortedArrayTest {

    @Before
    public void setup(){

    }
        
    @Test
    public void test() {
        RemoveDuplicatesfromSortedArray r = new RemoveDuplicatesfromSortedArray();
        int [] nums = {1,1,2,2,2,3,4};
        r.removeDuplicates(nums);   
    }
}
    