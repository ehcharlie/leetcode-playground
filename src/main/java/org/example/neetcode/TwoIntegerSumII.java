package org.example.neetcode;

public class TwoIntegerSumII {

    public static int[] example(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length -1;

        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                return new int[]{left, right};
            }

            if (numbers[left] + numbers[right] > target) {
                right--;
            }

            if (numbers[left] + numbers[right] < target) {
                left++;
            }
        }

        return new int[]{};
    }
}