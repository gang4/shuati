package com.shuati;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;    
    
public class ClimbingStairsTest {

    @Before
    public void setup(){

    }
        
    @Test
    public void test() {
        ClimbingStairs c = new ClimbingStairs();
        assertTrue(c.climbStairs(2) == 2); 
        assertTrue(c.climbStairs(3) == 3); 
        assertTrue(c.climbStairs(4) == 5);    
    }
}
    