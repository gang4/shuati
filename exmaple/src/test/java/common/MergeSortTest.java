package common;
import org.junit.Test;
import org.junit.Before;    
   
public class MergeSortTest {

    @Before
    public void setup(){

    }

    @Test
    public void testMerge31() {
        int [] nums = Utils.arrayGen(10);
        MergeSort s = new MergeSort();
        s.sort(nums, 0, nums.length);
        Utils.assetSorted(nums);        
    }

    @Test
    public void testMerge32() {
        int [] nums = {9, 54, 98, 16, 48, 68};
        MergeSort s = new MergeSort();
        int middle = nums.length / 2;
        s.merge(nums, 0, middle, nums.length);
        Utils.assetSorted(nums);        
    }

    @Test
    public void testMerge51() {
        int [] nums = {16, 64, 14, 43, 57}; //Utils.arrayGen(5);
        MergeSort s = new MergeSort();
        int middle = nums.length / 2;
        s.merge(nums, 0, middle, nums.length);
        Utils.assetSorted(nums);        
    }

    @Test
    public void testMerge2() {
        // int [] nums = ArrayGen.gen();
        int [] nums = {10, 9};//, 20, 31, 7};
        MergeSort s = new MergeSort();
        int middle = nums.length / 2;
        s.merge(nums, 0, middle, nums.length);
        Utils.assetSorted(nums);        
    }

    @Test
    public void testMerge41() {
        // int [] nums = ArrayGen.gen();
        int [] nums = {3, 9, 4, 5, 6};//, 20, 31, 7};
        MergeSort s = new MergeSort();
        s.merge(nums, 0, 2, nums.length);
        Utils.assetSorted(nums);        
    }

    @Test
    public void testMerge3() {
        int [] nums = {8, 2, 5};
        MergeSort s = new MergeSort();
        int middle = nums.length / 2;
        s.merge(nums, 0, middle, nums.length);
        Utils.assetSorted(nums);        
    }

    @Test
    public void testMerge4() {
        // int [] nums = ArrayGen.gen();
        int [] nums = {8, 9, 2, 5};//, 20, 31, 7};
        MergeSort s = new MergeSort();
        int middle = nums.length / 2;
        s.merge(nums, 0, middle, nums.length);
        Utils.assetSorted(nums);        
    }
}
    