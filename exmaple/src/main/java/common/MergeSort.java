package common;

public class MergeSort {
    public void sort(int [] nums, int low, int high) {
        if (high - low < 2) {
            return;
        }
        int middle = low + (high - low) / 2;
        sort(nums, low, middle);
        sort(nums, middle, high);
        merge(nums, low, middle, high);
    }

    public void merge(int[] nums, int low, int middle, int high) {
        int second = middle;
        for (int first = low; first < middle; first ++) {
            if (high - 1 <= second) {
                second = middle;   
            }
            // {8, 2, 5}
            // {8}, {2, 5}
            //
            // {3, 9, 4, 5, 6}
            // {3, 9}, {4, 5, 6}
            //
            // {16, 64, 14, 43, 57}
            // {16, 64}, {14, 43, 57}
            // Seach the first swapable
            while (second < high && nums[first] < nums[second]) {
                second ++;
            }

            if (second < high) {
                // swap
                int tmp = nums[first];
                nums[first] = nums[second];
                nums[second] = tmp;
            }
            // swap rests in the second
            for (; second < high - 1; second++) {
                if (nums[second + 1] < nums[second]) {
                    int tmp = nums[second];
                    nums[second] = nums[second + 1];
                    nums[second + 1] = tmp;
                }
                // else {
                //     break;
                // }
            }
        }
    }
}
