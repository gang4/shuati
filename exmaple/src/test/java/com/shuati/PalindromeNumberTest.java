package com.shuati;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Random;

import org.junit.Before;    
    
public class PalindromeNumberTest {

    @Before
    public void setup(){

    }
        
    @Test
    public void test() {
        PalindromeNumber p = new PalindromeNumber();
        Random r = new Random();
        int x = r.nextInt(100000000 / 2) + 100000000;
        System.out.println(x);
        int [] nums = p.toIntArray(x);
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void testPalindromeNumber() {
        PalindromeNumber p = new PalindromeNumber();
        int x = 102343201;
        System.out.println(x);
        assertTrue(p.isPalindrome(x));
    }
}
    