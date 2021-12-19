package common;

import org.junit.Test;
import org.junit.Before;    
    
public class QuickSortTest {

    @Before
    public void setup(){

    }
        
    @Test
    public void test() {
        int [] nums = Utils.arrayGen(10);
        QuickSort s = new QuickSort();
        s.sort(nums, 0, nums.length - 1);
        Utils.assetSorted(nums); 
    }
}
    