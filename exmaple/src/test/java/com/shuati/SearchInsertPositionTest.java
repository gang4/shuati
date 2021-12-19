package com.shuati;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;    
    
public class SearchInsertPositionTest {

    @Before
    public void setup(){

    }

    @Test
    public void test4() {
        SearchInsertPosition s = new SearchInsertPosition();
        int [] nums = {1, 3};
        int rt = s.searchInsert(nums, 4);
        assertTrue(rt == 0); 
    }

    @Test
    public void test3() {
        SearchInsertPosition s = new SearchInsertPosition();
        int [] nums = {1, 3, 5, 6};
        int rt = s.searchInsert(nums, 0);
        assertTrue(rt == 0); 
    }

    @Test
    public void test2() {
        SearchInsertPosition s = new SearchInsertPosition();
        int [] nums = {1, 3, 5, 8, 10};
        int rt = s.searchInsert(nums, 9);
        assertTrue(rt == 4); 
    }

    @Test
    public void test1() {
        SearchInsertPosition s = new SearchInsertPosition();
        int [] nums = {1, 3};
        int rt = s.searchInsert(nums, 2);
        assertTrue(rt == 1); 
    }

    @Test
    public void test() {
        SearchInsertPosition s = new SearchInsertPosition();
        int [] nums = {1};
        int rt = s.searchInsert(nums, 2);
        assertTrue(rt == 1); 
    }
}
    