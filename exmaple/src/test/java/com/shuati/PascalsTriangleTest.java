package com.shuati;
import org.junit.Test;
import org.junit.Before;    
    
public class PascalsTriangleTest {

    @Before
    public void setup(){

    }
        
    @Test
    public void test() {
        PascalsTriangle p = new PascalsTriangle();
        // p.generate(2); 
        p.generate(5);     
    }
}
    