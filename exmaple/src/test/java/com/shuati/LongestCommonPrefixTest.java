package com.shuati;
import org.junit.Test;
import org.junit.Before;    
    
public class LongestCommonPrefixTest {

    @Before
    public void setup(){

    }
        
    @Test
    public void test() {
        //String [] strs = {"ab", "a"};
        String [] strs = {"flower","flow","flight"};
        LongestCommonPrefix l = new LongestCommonPrefix();
        l.longestCommonPrefix(strs);
    }
}
    