package org.example.algorithms.search;


//Picture a scenario where you're sorting through a collection of books arranged by publish date, and for some reason,
//they've gotten mixed up. You now have a series where some books have been shifted from the beginning to the end,
//and you must find the oldest book. This is the essence of a rotated sorted array.
public class BinarySearchRotatedArray {

    public static void example() {
        int[] nums = new int[] {4, 3, 2, 1, 7, 6, 5};
        System.out.println(findMax(nums));  // Output: 7

        int[] nums2 = new int[] {3, 2, 1};
        System.out.println(findMax(nums2));  // Output: 3

        int[] nums3 = new int[] {6, 5, 4, 3, 2, 1, 7};
        System.out.println(findMax(nums3));  // Output: 7
    }

    public static int findMax(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return nums[left];
    }


}