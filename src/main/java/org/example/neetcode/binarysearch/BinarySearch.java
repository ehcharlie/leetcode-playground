package org.example.neetcode.binarysearch;

public class BinarySearch {

    public static int recursive(int[] nums, int target) {
        return binarySearch(0, nums.length - 1, nums, target);
    }

    private static int binarySearch(int start, int end, int[] nums, int target) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (nums[mid] == target) {
            return mid;
        }

        return (nums[mid] < target) ?
                binarySearch(mid + 1, end, nums, target) :
                binarySearch(start, mid - 1, nums, target);


    }

    public static int iterative(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}