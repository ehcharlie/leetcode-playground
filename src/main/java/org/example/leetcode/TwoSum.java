package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] example(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];

            if (seen.containsKey(target - currentNum)) {
                return new int[] {i, seen.get(target-currentNum)};
            } else {
                seen.put(currentNum, i);
            }
        }

        return new int[] {-1, -1};
    }
}