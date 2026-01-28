package org.example.neetcode.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {

    public static boolean example(int[] nums, int k) {
        Set<Integer> seen = new HashSet<>();
        int leftPointer = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i - leftPointer > k) {
                seen.remove(nums[leftPointer]);
                leftPointer++;
            }
            if (seen.contains(nums[i])) {
                return true;
            }

            seen.add(nums[i]);
        }

        return false;
    }
}