package com.shuati;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;    
    
public class StrStrTest {

    @Before
    public void setup(){

    }
        
    @Test
    public void test() {
        StrStr s = new StrStr();
        int idx = s.strStr("aabaaabaaac", "aabaaac");
        assertTrue(idx == 2);
    }
}
    