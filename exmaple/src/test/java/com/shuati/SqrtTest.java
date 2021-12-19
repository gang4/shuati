package com.shuati;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;    
    
public class SqrtTest {

    @Before
    public void setup(){

    }
        
    @Test
    public void test() {
        Sqrt s = new  Sqrt();
        //assertTrue(s.mySqrt(2147395600) == 46340);
        assertTrue(s.mySqrt(6) == 2); 
        assertTrue(s.mySqrt(9) == 3); 
        assertTrue(s.mySqrt(17) == 4); 
        assertTrue(s.mySqrt(1) == 1);
        assertTrue(s.mySqrt(2) == 1);  
  
    }
}
    