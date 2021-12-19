package common;

public class QuickSort {
    public void sort(int [] nums, int low, int high) {
        if (low < high) {
            int idx = partition(nums, low, high);
            sort(nums, low, idx - 1);
            sort(nums, idx + 1, high);
        }
    }

    private int partition(int [] nums, int low, int high) {
        int pivot = nums[high];
        int i = low - 1;
        // move all numbers > pivot to the right.
        // 2 4 11 15 6 7
        // 
        for (int j = low; j < high; j ++) {
            if (nums[j] < pivot) {
                // swap
                i ++;
                if (i != j) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        // swap
        i ++;
        int tmp = nums[i];
        nums[i] = nums[high];
        nums[high] = tmp;
        return i;
    }
}
