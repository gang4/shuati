package com.shuati;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;    
    
public class ValidParenthesesTest {

    @Before
    public void setup(){

    }
        
    @Test
    public void test() {
        ValidParentheses v = new ValidParentheses();
        boolean rt = v.isValid("()[]{}");
        assertTrue(rt);
    }
}
    