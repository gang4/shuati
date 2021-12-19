package common;

import static org.junit.Assert.assertTrue;

import java.util.Random;

public class Utils {
    public static int [] arrayGen(int length) {
        Random r = new Random();
        int len = r.nextInt(length / 2) + length;
        int [] nums = new int[len];
        for (int i = 0; i < nums.length; i ++) {
            nums[i] = r.nextInt(100);
        }
        return nums;
    }

    public static void assetSorted(int [] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            assertTrue("less", nums[i] <= nums[i + 1]);
        }
    }

    public static void printArray(int[] nums, int low, int middle, int high) {
        System.out.println("low     : " + low);
        System.out.println("middle  : " + middle);
        System.out.println("high    : " + high);
    } 

    public static void printArray(int[] nums, int low, int high) {
        for (int i = low; i < high; i ++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
